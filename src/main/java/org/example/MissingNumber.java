package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public static void main(String[] args) {

        int[] numbers = {0,1,3,4,2};

        printMissingNumberWithSorting(numbers);
        printMissingNumberWithMap(numbers);
        printMissingNumber(numbers);
    }

    private static void printMissingNumber(int[] numbers) {
        int n = numbers.length;
        int expectedTotal = (n*(n+1))/2;
        int sumOfNumbers = Arrays.stream(numbers).sum();
        int missingNumber = expectedTotal - sumOfNumbers;
        System.out.println("Missing number is - " + missingNumber);
    }

    private static void printMissingNumberWithMap(int[] numbers) {
        int n = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put(num, num);
        }

        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                System.out.println("Missing number is - " + i);
            }
        }
    }

    private static void printMissingNumberWithSorting(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        int count = 0;
        boolean isFound = false;
        for (int number : numbers) {
            if (number != count) {
                System.out.println("Missing number is - " + count);
                isFound = true;
                break;
            }
            count++;
        }
        if (!isFound) {
            System.out.println("Missing number is - " + n);
        }
    }
}
