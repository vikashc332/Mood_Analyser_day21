package com.blz.moodanalyser;

public class MoodAnalyser {
        private String message;

        public static void main(String[] args) {
            System.out.println("Welcome To Mood Analyser");
        }

    /*creating a function for checking the mood Happy or Sad
    input we are passing some String message
    output the mood is Happy or sad will get.*/

        public MoodAnalyser(){
        }

        public MoodAnalyser(String message) {
            this.message = message;
        }

        public String analyseMood(String message) {
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        }

        public String analyseMood() {
            if (message.contains("Happy"))
                return "Sad";
            else
                return "Happy";
        }
    }


