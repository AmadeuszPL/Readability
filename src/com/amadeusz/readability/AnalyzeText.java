package com.amadeusz.readability;

public class AnalyzeText {

    private final String textToAnalyze;
    private int numberOfWords;

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    private int numberOfSentences;
    private int numberOfLetters;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public AnalyzeText(String textToAnalyze) {
        this.textToAnalyze = textToAnalyze;
    }

    public void countWords() {

        String[] words = textToAnalyze.split(" ");
        this.numberOfWords = words.length;
    }

    public void countSentences() {

        String[] sentences = textToAnalyze.split("[!?.]");
        this.numberOfSentences = sentences.length;
    }

    public void countLetters() {

        int numberOfLetters = 0;
        for (int i = 0; i < textToAnalyze.length(); i++) {
            char c = textToAnalyze.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                numberOfLetters++;
            }
        }
        this.numberOfLetters = numberOfLetters;
    }

    public void countGrade() {
        grade = (int) Math.round(0.058d * (numberOfLetters * 100d) / numberOfWords -
                15.8 - 0.269d * numberOfSentences * 100 / numberOfWords);
        System.out.println(grade);
    }

}
