package org.example.numbers;

public class Factorial {

    public static void main(String[] args) {

        int num = 5;
        int factorial = findFactorial(num);
        System.out.printf("Factorial of %s is %s", num, factorial);
    }

    private static int findFactorial(int num) {
        if (num == 0 || num == 1) return num;
        return num * findFactorial(num-1);
    }
}
