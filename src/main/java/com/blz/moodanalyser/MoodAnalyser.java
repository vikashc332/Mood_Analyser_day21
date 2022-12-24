package com.blz.moodanalyser;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Welcome To Mood Analyser");

        //creating a object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("Hi, I Am Vikas , I am sad"));

    }
    /*creating a function for checking the mood Happy or Sad
    input we are passing some String message
    output the mood is Happy or sad will get.*/

    public String analyseMood(String message) {
        return "Sad";
    }
}
