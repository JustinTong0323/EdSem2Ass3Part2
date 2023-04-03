package literatureStats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class FrequencyDocumentReader {
    private FrequencyDocumentReader() {} // 01/04/2023 updated to have private visibility

    public static final String DEFAULT_NON_WORD_CHARS = "[^a-zA-Z0-9'\\s]+";

    /**
     * TODO: Reads the named document file using default settings. Use the
     *  defaults for information not provided.
     *
     * @param dictionaryFileName
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            String dictionaryFileName) {
        return null;
    }

    /**
     * TODO: Reads a document using default settings for those not provided.
     *
     * @param dictionaryFileName
     * @param nonWordChars
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            String dictionaryFileName, String nonWordChars) {
    return null;
    }

    /**
     * TODO: reads a document using the default set of non-word characters.
     *
     * @param config
     * @return
     */
    public static Map<String, FrequencyWord> readDocument(
            FrequencyReaderConfig config) {

        return readDocument(config, DEFAULT_NON_WORD_CHARS);
    }

    /** TODO read the file specified in the configuration and obey the
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

        boolean started = false;

        try ( final Scanner sc = new Scanner(
                new File(config.DOCUMENT_FILENAME)) ) {
            while ( sc.hasNextLine() ) {
                String line = sc.nextLine();
            }
        } catch ( FileNotFoundException e ) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
