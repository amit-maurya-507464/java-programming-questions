package org.example.numbers;

import java.util.Arrays;

public class ProductOfArrayElements {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 2};
        int num = 2;
//        printProductOfElements(numbers);
//        printProductOfElementsExceptNumber(numbers, num);
        printProductOfElementsUsingJava8(numbers);
//        printProductOfElementsExceptNumberUsingJava8(numbers, num);

        System.out.println(multiplyWithRecursion(numbers, 0));

    }

    public static void printProductOfElements(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println(product);
    }

    public static void printProductOfElementsExceptNumber(int[] numbers, int num) {
        int product = 1;
        for (int number : numbers) {
            if (number==num) continue;
            product *= number;
        }
        System.out.println(product);
    }

    public static void printProductOfElementsUsingJava8(int[] numbers) {
        int product = Arrays.stream(numbers).reduce(1, (a, b) -> a*b);
        System.out.println(product);
    }

    public static void printProductOfElementsExceptNumberUsingJava8(int[] numbers, int num) {
        int product = Arrays.stream(numbers).filter(i -> i!=num).reduce(1, (a, b) -> a*b);
        System.out.println(product);
    }


    public static int multiplyWithRecursion(int[] arr, int index) {
        if (index==arr.length) return 1;
        return arr[index] * multiplyWithRecursion(arr, index+1);
    }

}
