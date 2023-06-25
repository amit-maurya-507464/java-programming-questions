package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyOdd {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,5,3,7,11,9,12);

//        boolean isOnlyOddNumbers = checkIfOnlyOddNumbers(integerList);
        boolean isOnlyOddNumbers = checkIfOnlyOddNumbersByStream(integerList);

        if (isOnlyOddNumbers)
            System.out.println("All numbers are odd in list");
        else
            System.out.println("All numbers are not odd in list");
    }

    private static boolean checkIfOnlyOddNumbersByStream(List<Integer> integerList) {
        return integerList.parallelStream()
                .allMatch(n -> n%2!=0);
    }

    private static boolean checkIfOnlyOddNumbers(List<Integer> integerList) {
        for (Integer integer : integerList) {
            if (integer%2==0) return false;
        }
        return true;
    }
}
