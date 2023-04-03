package a3algorithms;

/**
 * Stores a word with its frequency of usage.
 * This word has no knowledge of any other words.
 */
public class SimpleFrequencyWord implements Comparable<SimpleFrequencyWord> {
    // TODO: 01/04/2023 initialise elsewhere
    protected final String word = "TODO you need to change where this is initialised";

    protected int count; // TODO: 01/04/2023 initialise elsewhere

    /**
     * TODO: constructor.
     *  Ensure class variables are initialised.
     *
     * @param word
     */
    SimpleFrequencyWord(String word) {
    }

    /**
     * TODO: getWord() is the getter for the core word.
     *
     * @return
     */
    public String getWord() {
        return "TODO SimpleFrequencyWord.getWOrd()";
    }

    /**
     * TODO: getCount() is the getter for the current word frequency.
     */
    public int getCount() {
        return Integer.MIN_VALUE;
    }

    /**
     * TODO: incrementCount by one.
     */
    public void incrementCount() {
    }

    /**
     * TODO: toString generates a one-line String according to the pattern
     *              digits right-justified in 4 spaces
     *              tab
     *              the word
     */
    @Override
    public String toString() {
        return "TODO SimpleFrequencyWord.toString()";
    }

    /**
     * TODO: toString(String) generates a one-line String of the frequency
     *  then the normalised word according to the supplied pattern.
     *
     * @param wordStatePattern
     * @return
     */
    public String toString(String wordStatePattern) {
        return "TODO SimpleFrequencyWord.toString(String)";
    }

    /**
     * TODO: compareTo() knows how to compare this object with another of the same type.
     *          You need to learn how to do this. Compare frequencies.
     *
     * @param other the counterpart object to be compared with.
     * @return
     */
    @Override
    public int compareTo(SimpleFrequencyWord other) {
        return Integer.MIN_VALUE;
    }
}
