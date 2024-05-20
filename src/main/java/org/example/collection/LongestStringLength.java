package org.example.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringLength {

    public static void main(String[] args) {

        String[] strings = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};

        printLongestStringLength(strings);
        printLongestString(strings);
        printLongestStringUsingJava8(strings);

    }

    public static void printLongestStringLength(String[] strings) {
        int max = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
        System.out.println("longest string length = " + max);
    }

    public static void printLongestString(String[] strings) {
        String longest = "";
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println(longest);
    }

    public static void printLongestStringUsingJava8(String[] strings) {
        String string = Arrays.stream(strings).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Longest string is = " + string);

    }
}
