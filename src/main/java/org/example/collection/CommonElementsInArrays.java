package org.example.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 8};
        int[] array2 = {4, 5, 6, 7, 8};

        List<Integer> integerList = Arrays.stream(array1).filter(i -> Arrays.stream(array2).anyMatch(i1 -> i == i1)).boxed().collect(Collectors.toList());

        System.out.println(integerList);

    }

}
