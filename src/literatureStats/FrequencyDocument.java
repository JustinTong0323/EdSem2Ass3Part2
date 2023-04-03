package literatureStats;

import java.util.Map;

// updated comment to explain how to use the object properly
/**
 * A FrequencyDocument stores all the words and their words of an entire single
 * document or file.
 * <p>
 * Constructors should use initialise but not read the file
 * <p>
 * The correct way to use this object is (in order)
 * construct it
 * initialise it if and only if the default constructor was used
 * read the file
 * <p>
 * Every instance must have a configuration file {@link FrequencyReaderConfig}
 */
public class FrequencyDocument {

    /**
     * TODO: words and frequencies stored in a data structure of whatever type you want.
     */
    protected Map<String, FrequencyWord> words;

    protected FrequencyReaderConfig config;

    protected String nonWordChars;

    /**
     * If calling the default constructor, you need to explicitly call one of the
     * initialise() methods before you can use the object safely.
     */
    public FrequencyDocument() {
        this.words        = null; // 01/04/2023 reordered to match declarations
        this.config       = null;
        // this.filename     = null; // 01/04/2023 updated: removed as it was redundant
        this.nonWordChars = null; // 01/04/2023 updated: added for consistency
    }

    /**
     * TODO: constructor based on a filename.
     *
     * @param filename
     */
    public FrequencyDocument(String filename) {
    }

    /**
     * TODO: constructor for filename and a pattern specifying characters
     *  that are not allowed in words.
     *
     * @param filename
     * @param nonWordChars
     */
    public FrequencyDocument(String filename, String nonWordChars) {
    }

    /**
     * TODO: constructor using a configuration object.
     *
     * @param config
     */
    public FrequencyDocument(FrequencyReaderConfig config) {
    }

    /**
     * TODO: constructor using a configuration object and a pattern
     *  specifying characters that are not allowed in words.
     *
     * @param config
     * @param nonWordChars
     */
    public FrequencyDocument(FrequencyReaderConfig config,
                             String nonWordChars) {
    }

    /**
     * TODO: set or reset the configuration object.
     *
     * @param config
     */
    public void setConfig(FrequencyReaderConfig config) {
    }

    /**
     * TODO: Initialise based on a configuration object.
     *
     * @param config
     */
    public void initialise(FrequencyReaderConfig config) {
    }

    /**
     * TODO: initialise based on the filename to read. You must provide
     *  default values for any that are not provided.
     *
     * @param filename
     */
    public void initialise(String filename) {
    }

    /**
     * TODO: initialise based on the filename to read and a pattern
     *  specifying characters that are not allowed in words. You must provide
     *   default values for any that are not provided.
     *
     * @param filename
     * @param nonWordChars
     */
    public void initialise(String filename, String nonWordChars) {
    }

    /**
     * TODO: initialise based on a configuration and a pattern specifying characters
     *  that are not allowed in words. This version of initialise() needs the
     *  full set of information provided.
     *
     * @param config
     * @param nonWordChars
     */
    public void initialise(FrequencyReaderConfig config, String nonWordChars) {
    }

    /**
     * TODO: gets the pattern showing the characters that are not allowed in words.
     *
     * @return
     */
    public String getNonWordChars() {
        return "TODO FrequencyDocument.getNonWordChars";
    }

    /**
     * TODO: sets the pattern of characters that are not allowed in words.
     *
     * @param nonWordChars
     */
    public void setNonWordChars(String nonWordChars) {
    }

    /**
     * TODO: readDocument() calls the helper class's method to read a file.
     *  In the method here, it may be necessary to convert the data structure
     *  returned into the one used in this class.
     */
    public void readDocument() {
    }

    /**
     * TODO: getStatsNormalisedWords() returns the statistics of normalised words
     *  with the String in the default format provided by the FrequencyWord class.
     *
     * @return
     */
    public String[] getStatsNormalisedWords() {
        return new String[]{"TODO FrequencyDocument.getStatsNormalisedWords()"};
    }

    /**
     * TODO: getStatsNormalisedWords() returns the statistics of normalised words
     *  with the String in the format provided by the parameter.
     *
     * @param pattern
     * @return
     */
    public String[] getStatsNormalisedWords(String pattern) {
        return new String[]{"TODO FrequencyDocument.getStatsNormalisedWords()"};
    }

    /**
     * TODO: printStatsNormalisedWords() prints the statistics of normalised words
     *  with the String in the default format provided by the FrequencyWord class.
     */
    public void printStatsNormalisedWords() {
    }

    /**
     * TODO: printStatsNormalisedWords() prints the statistics of normalised words
     *  with the String in the format provided by the parameter.
     *
     * @param pattern
     */
    public void printStatsNormalisedWords(String pattern) {
    }
}
