package com.blz.moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @org.junit.Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Sad Mood");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Happy Mood");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Any Mood");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad_UsingParametrisedConstructor(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnSad_UsingParameterisedConstructor(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }
}

