package org.example.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 9, 8};

        System.out.println("Enter Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        findAllTwoNumbersWhichSumToNumber(arr, num);
        System.out.println("################");
        findAllTwoNumbersWhichSumToNumberWithHashMap(arr, num);
    }

    private static void findAllTwoNumbersWhichSumToNumber(int[] arr, int num) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) break;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > num) break;
                if (arr[i] + arr[j] == num) {
                    System.out.printf("%d + %d = %d %n", arr[i], arr[j], num);
                }
            }
        }
    }

    private static void findAllTwoNumbersWhichSumToNumberWithHashMap(int[] arr, int num) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int n : arr) {
            if (n > num) break;
            int complement = num - n;
            if (map.containsKey(complement)) {
                map.remove(complement);
                map.remove(n);
                System.out.printf("%d + %d = %d %n", n, complement, num);
            }
        }
    }
}
