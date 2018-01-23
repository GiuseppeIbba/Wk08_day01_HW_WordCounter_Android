package example.codeclan.com.wordcounterapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/01/2018.
 */

public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before() {
        wordCount = new WordCount();
    }

    @Test
    public void canHaveAnEmptyArray() {
        assertEquals(0, wordCount.getWordCount(""));
    }

    @Test
    public void canHaveItemsInArray() {
        assertEquals(9, wordCount.getWordCount(" I know what I don't have to do"));
    }

//    @Test
//    public void canHaveItemsInArray() {
//        assertEquals(8, wordCount.getWordCount("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity""));
//    }
}
