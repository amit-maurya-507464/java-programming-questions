package org.example.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Integer[] numbers = {5, 9, 2, 8, 3, 1, 1};

        int secondLargestNumber = Arrays.stream(numbers).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Second number not exist"));
        printSecondHighestNumber(numbers);

        System.out.println("Second smallest number = " + secondLargestNumber);
    }

    private static void printSecondHighestNumber(Integer[] numbers) {
        int highest = 0;
        int secondHighest = 0;
        for (int number : numbers) {
            if(number > highest) {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest) {
                secondHighest = number;
            }
        }
        System.out.println(secondHighest);
    }
}
