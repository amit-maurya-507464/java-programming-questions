package org.example;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 2, 8, 3, 1, 1};

        int secondLargestNumber = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Second number not exist"));

        System.out.println("Second smallest number = " + secondLargestNumber);
    }
}
