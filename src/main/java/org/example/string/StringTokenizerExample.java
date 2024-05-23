package org.example.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

//        String text = "Hello, world! This is an example of string tokenization. How's it going? Email me at test@example.com!";
        String text = "           YES      leading spaces        are valid,    problemsetters are         evillllll";

        printTokens(text);
//        printTokensWithTokenizer(text);
    }

    private static void printTokens(String text) {
        // Define the regex pattern for the delimiters
        String regex = "[\\s!?,._'@]+";

        // Split the string based on the pattern
        String[] tokens = text.split(regex);

        System.out.println(tokens.length);
        // Print the tokens
        Arrays.stream(tokens).forEach(System.out::println);
    }

    private static void printTokensWithTokenizer(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " !?,._'@");

        System.out.println(tokenizer.countTokens());
        // Print each token
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
