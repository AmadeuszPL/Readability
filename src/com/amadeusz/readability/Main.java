package com.amadeusz.readability;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grade = getAndProceedUserInput();
        printOutGrade(grade);
    }

    private static int getAndProceedUserInput() {
        System.out.print("Text:");
        Scanner getUserInput = new Scanner(System.in);
        String userInput = getUserInput.nextLine();
        AnalyzeText userText = new AnalyzeText(userInput);
        userText.countLetters();
        System.out.println("Letters " + userText.getNumberOfLetters());
        userText.countSentences();
        System.out.println("Sentences " + userText.getNumberOfSentences());
        userText.countWords();
        System.out.println("Words " + userText.getNumberOfWords());
        userText.countGrade();
        return userText.getGrade();
    }

    private static void printOutGrade(int grade) {
        if (grade < 1) {
            System.out.println("Before Grade 1");
        } else if (grade > 16) {
            System.out.println("Grade 16+");
        } else {
            System.out.println("Grade " + grade);
        }
    }
}
