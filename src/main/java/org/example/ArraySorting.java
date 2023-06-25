package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    public static void main(String[] args) {

        Integer[] intArray = {1, 9, 5, 2, 6, 25, 31, 8};

        Arrays.sort(intArray, Collections.reverseOrder());

        System.out.println(Arrays.toString(intArray));
    }
}
