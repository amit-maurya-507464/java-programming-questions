package org.example.numbers;

public class FibonacciSequence {
    public static void main(String[] args) {

        int number = 10;
        printFibonacciSeries(number);
        printFibonacciSeriesWithRecursion(number);

    }

    private static void printFibonacciSeries(int number) {
        System.out.println("Printing Fibonacci series without recursion");
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < number; i++) {
            System.out.print(a +", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    private static void printFibonacciSeriesWithRecursion(int number) {
        System.out.println("\n Printing fibonacci series with recursion");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciSeries(i) + ", ");
        }
    }

    private static int fibonacciSeries(int number) {
        if (number == 0 || number ==1) return number;
        else return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
    }

}
