package exercise;

import java.util.Arrays;
import java.util.ArrayList;

class App {
    public static boolean scrabble(String word1, String word2) {

        String words = word2.toLowerCase();
        for (char s: word1.toCharArray()) {
            words = words.replaceFirst(String.valueOf(s), "");
            }
        if (words.length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
