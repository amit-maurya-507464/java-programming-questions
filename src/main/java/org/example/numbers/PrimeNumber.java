package org.example.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");

    }

    private static boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1) return false;
        if (number == 2) return true;
        for(int i = 2; i <= number/2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
