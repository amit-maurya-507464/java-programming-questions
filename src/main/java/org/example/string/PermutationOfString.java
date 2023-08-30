package org.example.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {

    public static void main(String[] args) {

        System.out.println("Enter string to permutations:");

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.printf("Permutations of %s are: \n", string);
        printPermutations(string, "");

        System.out.printf("Distinct Permutations of %s are: \n", string);
        List<String> distinctPermutations = new ArrayList<>();
        printDistinctPermutations(string, "", distinctPermutations);
        System.out.println(distinctPermutations);
    }

    private static void printPermutations(String question, String answer) {

        if (question.isEmpty()) {
            System.out.println(answer);
        }

        for (int i = 0; i < question.length(); i++) {
            char character = question.charAt(i);
            String questionLeft = question.substring(0, i);
            String questionRight = question.substring(i+1);
            String restOfTheString = questionLeft + questionRight;
            printPermutations(restOfTheString, answer+character);
        }
    }

    private static void printDistinctPermutations(String question, String answer, List<String> distinctPermutations) {

        if (question.isEmpty()) {
            if(!distinctPermutations.contains(answer)) {
                distinctPermutations.add(answer);
            }
        }

        for (int i = 0; i < question.length(); i++) {
            char character = question.charAt(i);
            String questionLeft = question.substring(0, i);
            String questionRight = question.substring(i+1);
            String restOfTheString = questionLeft + questionRight;
            printDistinctPermutations(restOfTheString, answer+character, distinctPermutations);
        }
    }
}
