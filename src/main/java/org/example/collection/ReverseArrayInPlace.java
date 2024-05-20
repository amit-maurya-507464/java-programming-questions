package org.example.collection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
//        reverseArray(numbers);
        reverseArrayWithJava8(numbers);

    }

    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverseArrayWithJava8(int[] numbers) {
        IntStream.range(0, numbers.length / 2).forEach(i -> {
                    int temp = numbers[i];
                    numbers[i] = numbers[numbers.length - i - 1];
                    numbers[numbers.length - i - 1] = temp;
                }
        );
        System.out.println(Arrays.toString(numbers));
    }

}
