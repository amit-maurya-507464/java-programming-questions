package org.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrence {

    public static void main(String[] args) {

        System.out.println("Enter string to find occurrence:");

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        printOccurrence(string);
        printOccurrenceWithJava8(string);

    }

    private static void printOccurrence(String string) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (occurrenceMap.containsKey(c)) {
                occurrenceMap.put(c, occurrenceMap.get(c) + 1);
            } else {
                occurrenceMap.put(c, 1);
            }
        }
        System.out.println(occurrenceMap);
    }

    private static void printOccurrenceWithJava8(String string) {
        Map<Character, Long> occurrenceMap = string.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrenceMap);
    }
}
