package literatureStats;
/**
 * A FrequencyDocumentPG stores all the words and their words of a
 * Project Gutenberg ebook. This means it only stores the words of the actual
 * text and not the preamble and postamble added by Project Gutenberg.
 * <p>
 * Every instance must have a configuration file {@link FrequencyReaderConfig}
 */
public class FrequencyDocumentPG extends FrequencyDocument {
    public static final String PG_DOCUMENT_START =
            "*** START OF THE PROJECT GUTENBERG EBOOK";
    public static final String PG_DOCUMENT_STOP  =
            "*** END OF THE PROJECT GUTENBERG EBOOK";

    /**
     * TODO: default constructor is the parent's constructor. This should be a 
     *  one-liner.
     */
    public FrequencyDocumentPG() {
    }

    /**
     * TODO: constructor based on a filename. Use the defaults for information
     *  not provided.
     *
     * @param filename
     */
    public FrequencyDocumentPG(String filename) {
    }

    /**
     * TODO: constructor for filename and a pattern specifying characters
     *  that are not allowed in words. Use the defaults for information not
     *  provided.
     *
     * @param filename
     * @param nonWordChars
     */
    public FrequencyDocumentPG(String filename, String nonWordChars) {
    }

    /**
     * TODO: constructor using a configuration object. Use the defaults for
     *  information not provided.
     *
     * @param config
     */
    public FrequencyDocumentPG(FrequencyReaderConfig config) {
    }

    /**
     * TODO: constructor using a configuration object and a pattern
     *  specifying characters that are not allowed in words. This version
     *  is provided with all the information it needs and should be a one-liner.
     *
     * @param config
     * @param nonWordChars
     */
    public FrequencyDocumentPG(FrequencyReaderConfig config,
                               String nonWordChars) {
    }

    /**
     * TODO: Initialise based on a filename. Use the defaults for information
     *  not provided.
     *
     * @param filename
     */
    @Override
    public void initialise(String filename) {
    }

    /**
     * TODO: constructor using a filename and a pattern specifying characters
     *  that are not allowed in words. Use the defaults for information not
     *  provided.
     *
     * @param filename
     * @param nonWordChars
     */
    @Override
    public void initialise(String filename, String nonWordChars) {
    }
}