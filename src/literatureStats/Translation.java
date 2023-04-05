package literatureStats;

import java.io.File;
import java.util.Scanner;

/**
 * Code to translate words according to the language is directly inside this enum.
 */
public enum Translation {
    NONE {
        @Override
        public String translate(String word) {
            return word;
        }
    },

    // DONE: put the code for translating troll directly inside the overriden method
    TROLL {
        @Override
        public String translate(String word) {
            return "grunt";
        }
    },

    /* DONE: translate into British doggie speak. Dogs from different countries
        speak different doggie languages. British dogs speak like this:
        1. Move the first non-vowel cluster to the end of the word.
            This is everything up to but not including the first vowel.
        2. Append "ay" to the word unless:
           2.1 the word originally began with "b" in which case it ends "bark"
               before -> eforebark, but -> utbark
           2.2 the word originally began with "g" in which case it ends "grrrowl"
               with 3 rs but the "g" is the one that was originally at the start
               of the word:
               good	->	oodgrrrowl, great -> eatgrrrrowl, gutenberg -> utenberggrrrowl
           2.3 the word originally began with "r" in which case it ends "rrruf"
               with 3 rs but the first of those is the "r" that was originally
               at the start of the word:
               ross	->	ossrrruf, room	->	oomrrruf
           2.4 the word originally began with "w" in which case
               2.4.1 it ends "woof" with the "w" being the one that was
                     originally at the start of the word
                     was -> aswoof, who -> owhwoof
               2.4.2 unless the word orginally began "wo" in which case it ends
                     "woofWoof" (note the one capital W) where the first "w" is
                     the one that was originally at the start of the word:
                     work -> orkwoofWoof, would -> ouldwoofWoof
        Other examples:
          3 -> 3ay, a -> aay, ay -> ayay, ebook -> ebookay, under -> underay
          An empty word is completely unchanged.
     */
    DOG {
        @Override
        public String translate(String word) {
            StringBuilder result = new StringBuilder();
            // iterate the word to find the first vowel
            for (int i = 0; i < word.length(); i++) {
                if (FrequencyWord.VOWELS.contains(word.substring(i, i + 1))) {
                    result.insert(0, word.substring(i));
                    break;
                }
                result.append(word.charAt(i));
            }

            String wordStep1 = result.toString();
            switch (word.charAt(0)) {
                case 'b':
                    if (word.length() > 1 && wordStep1.endsWith("b")) {
                        result.append("ark");
                    } else {
                        result.append("bark");
                    }
                    break;
                case 'g':
                    if (wordStep1.endsWith("g")) {
                        result.append("rrrowl");
                    } else if (wordStep1.endsWith("gr")) {
                        result.append("rrowl");
                    } else if (wordStep1.endsWith("grr")) {
                        result.append("rowl");
                    } else if (wordStep1.endsWith("grrr")) {
                        result.append("owl");
                    } else {
                        result.append("grrrowl");
                    }
                    break;
                case 'r':
                    if (wordStep1.endsWith("rr")) {
                        result.append("ruf");
                    } else if (wordStep1.endsWith("r")) {
                        result.append("rruf");
                    } else {
                        result.append("rrruf");
                    }
                    result.append("rrruf");
                    break;
                case 'w':
                    if (word.length() > 1 && word.charAt(1) == 'o') {
                        result.append("oofWoof");
                    } else if (wordStep1.endsWith("w")) {
                        result.append("oof");
                    } else {
                        result.append("woof");
                    }
                    break;
                default:
                    result.append("ay");
                    break;
            }

            return result.toString();
        }
    };

    /**
     * DONE: Translates the word component of a {@link FrequencyWord}.
     *
     * @param frequencyWord
     * @return
     */
    public String translate(FrequencyWord frequencyWord) {
        return translate(frequencyWord.getNormalised());
    }

    /**
     * The base pattern for translating. DO NOT CHANGE THIS IN ANY WAY.
     *
     * @param word
     * @return
     */
    public abstract String translate(String word);

    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(new File("input/2023_04_04_a-Macbeth_dogs.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split("\t->\t");
                String translate = DOG.translate(words[0]);
                if (!translate.equals(words[1])) {
                    System.out.printf("Fail: %s, \t Got: %s%n", line, translate);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
