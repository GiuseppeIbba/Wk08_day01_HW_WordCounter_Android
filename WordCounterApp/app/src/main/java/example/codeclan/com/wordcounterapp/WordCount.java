package example.codeclan.com.wordcounterapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 22/01/2018.
 */

class WordCount {


    public static int getWordCount(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }


//    public int getWordCount(String sentence) {
//        ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
//        if (words.contains("")) {
//            words.remove("");
//        }
//        return words.size();
//    }
}
