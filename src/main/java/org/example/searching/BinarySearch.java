package org.example.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 7, 4, 77, 11, 19, 9};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int key = 77;

        int index = binarySearch(array, key);

        System.out.println(index);

    }

    private static int binarySearch(int[] array, int key) {
        int min = 0;
        int max = array.length;
//        int mid = (array[min] + array[max]) / 2;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key > array[mid]) {
                min = mid + 1;
            }
            if (key < array[mid]) {
                max = mid - 1 ;
            }
        }
        return -1;
    }
}
