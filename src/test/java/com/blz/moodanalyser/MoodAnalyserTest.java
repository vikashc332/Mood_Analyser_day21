package com.blz.moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @org.junit.Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Sad Mood");
        Assert.assertEquals("Sad", mood);
    }
}