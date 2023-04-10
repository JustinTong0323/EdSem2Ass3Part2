package literatureStats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class FrequencyDocumentReader {
    private FrequencyDocumentReader() {
    } // 01/04/2023 updated to have private visibility

    public static final String DEFAULT_NON_WORD_CHARS = "[^a-zA-Z0-9'\\s]+";

    /**
     * DONE: Reads the named document file using default settings. Use the
     *  defaults for information not provided.
     *
     * @param dictionaryFileName
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(String dictionaryFileName) {
        return readDocument(new FrequencyReaderConfig(dictionaryFileName,FrequencyReaderConfig.EMPTY_MARKER,FrequencyReaderConfig.EMPTY_MARKER,Verbosity.MAXIMUM));
    }

    /**
     * DONE: Reads a document using default settings for those not provided.
     *
     * @param dictionaryFileName
     * @param nonWordChars
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            String dictionaryFileName, String nonWordChars) {
        return readDocument(new FrequencyReaderConfig(dictionaryFileName,FrequencyReaderConfig.EMPTY_MARKER,FrequencyReaderConfig.EMPTY_MARKER,Verbosity.MAXIMUM), nonWordChars);
    }

    /**
     * DONE: reads a document using the default set of non-word characters.
     *
     * @param config
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            FrequencyReaderConfig config) {

        return readDocument(config, DEFAULT_NON_WORD_CHARS);
    }

    /**
     * DONE read the file specified in the configuration and obey the
     *   start and stop markers.
     *   If the configuration has a non-zero verbosity then print the following messages:
     *   if the word is new:
     *   Added normalisedWord
     *   if the word already exists:
     *   Incremented normalisedWord to newCount
     *   In both cases substitute normalisedWord with the actual normalised form.
     *   If a word already exists print the count that includes the instance you
     *   are processing.
     *
     * @param config
     * @param nonWordChars
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            FrequencyReaderConfig config, String nonWordChars) {
        HashMap<String, FrequencyWord> words = new HashMap<>();
        boolean started = false;
        boolean isVerbose = config.getVerbosity().isVerbose();

        try (final Scanner sc = new Scanner(
                new File(config.DOCUMENT_FILENAME))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (Objects.equals(config.START_MARKER, FrequencyReaderConfig.EMPTY_MARKER)
                        && Objects.equals(config.STOP_MARKER, FrequencyReaderConfig.EMPTY_MARKER)) {
                    // if both start and stop markers are null, set started to true
                    started = true;

                } else if (line.contains(config.START_MARKER)) {
                    // if the line contains the start marker, set started to true and skip the line
                    started = true;
                    continue;

                } else if (line.contains(config.STOP_MARKER)) {
                    // if the line contains the stop marker, break
                    break;
                }

                // if started is false, skip the line
                if (!started) {
                    continue;
                }

                String lineWithoutChars = line.replaceAll(nonWordChars, " ");

                // skip if line is blank
                if (lineWithoutChars.isBlank()) {
                    continue;
                }

                String[] wordsInLine = lineWithoutChars.split("\\s+");

                for (String word : wordsInLine) {
                    // skip if word is blank
                    if (word.isBlank()) {
                        continue;
                    }

                    String normalisedWord = FrequencyWord.normalise(word);

                    if (!words.containsKey(normalisedWord)) {
                        // if word is not in the map, add it and print message
                        words.put(normalisedWord, new FrequencyWord(normalisedWord));
                        if (isVerbose) {
                            System.out.printf("Added %s%n", normalisedWord);
                        }
                    } else {
                        // if word is in the map, increment the count and print message
                        FrequencyWord frequencyWord = words.get(normalisedWord);
                        frequencyWord.incrementCount();
                        if (isVerbose) {
                            System.out.printf("Incremented %s to %d%n", normalisedWord, frequencyWord.getCount());
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return words;
    }

    public static void main(String[] args) {
        FrequencyReaderConfig config = new FrequencyReaderConfig("input/macbeth.txt",FrequencyDocumentPG.PG_DOCUMENT_START,FrequencyDocumentPG.PG_DOCUMENT_STOP,Verbosity.MAXIMUM);
        Map<String, FrequencyWord> words = readDocument(config);
        System.out.println(words);
    }
}
