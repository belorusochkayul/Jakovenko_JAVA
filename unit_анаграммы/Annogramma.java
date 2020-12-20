package kiparo.com;

import java.util.Arrays;

public class Annogramma {

    public boolean checkAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        char[] word1 = firstWord.replaceAll("\\s", "").toCharArray();
        char[] word2 = secondWord.replaceAll("\\s", "").toCharArray();

        if (word1.length != word2.length) {
            return false;
        }
        Arrays.sort(word1);
        Arrays.sort(word2);

        if (Arrays.equals(word1, word2)) {
            return true;
        }
        return false;
    }
}