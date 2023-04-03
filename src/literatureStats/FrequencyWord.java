package literatureStats;

import java.util.Set;

/**
 * This is the proper class for storing a word and its frequency count.
 */
public class FrequencyWord implements Comparable<FrequencyWord> {
    public static final String DEFAULT_WORD_STATS_PATTERN = "%4d\t%s%n";

    /**
     * TODO: Store the set of vowels [a, e, i, o, u] ("y" is not considered a vowel.)
     */
    public static final Set<String> VOWELS =null;

    protected final String normalised = null; // TODO: you'll need to initialise this elsewhere

    protected int count; // TODO: you'll need to initialise this elsewhere

    /**
     * TODO: Create constructor.
     *
     * @param word
     */
    FrequencyWord(String word) {
    }

    /**
     * TODO: normalise means a word is entirely lowercase and
     *  has no leading or trailing whitespace.
     * <p>
     *  Note this returns a normalised form of the parameter.
     *
     * @param word the String to be normalised
     * @return
     */
    public static String normalise(String word) {
        return "TODO: normalise(String)";
    }

    /**
     * TODO: getter for the normalised form of the current word.
     *
     * @return
     */
    public String getNormalised() {
        return "TODO FrequencyWord.getNormalised()";
    }


    /**
     * TODO: getter for the current frequency of the current word.
     *
     * @return
     */
    public int getCount() {
        return Integer.MIN_VALUE;
    }

    /**
     * TODO: increment the frequency count of the current word by one
     */
    public void incrementCount() {
    }

    /**
     * TODO: gets a String of this object's data (frequency and normalised word-form)
     *  formatted according to the default word statistics pattern.
     *
     * @return
     */
    @Override
    public String toString() {
        return "TODO FrequencyWord.toString()";
    }

    /**
     * TODO: gets a String of this object's data (frequency and normalised word-form)
     *  formatted according to the provided word statistics pattern.
     *
     * @param wordStatePattern
     * @return
     */
    public String toString(String wordStatePattern) {
        return "TODO: FrequencyWord.toString(String)";
    }

    /**
     * TODO: A FrequencyWord knows how to compare itself with another FrequencyWord.
     *  You will have to research how this is done. Compare frequencies.
     *
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(FrequencyWord other) {
        return Integer.MIN_VALUE;
    }
}
