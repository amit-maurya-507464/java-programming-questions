package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 1, 8, 7, 5, 2, 99, 7, 6, 82};
        int[] sorted = sort(numbers);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sort(int[] numbers) {

        for(int i=0; i<numbers.length; i++) {
            int min = i;

            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        return numbers;
    }
}
