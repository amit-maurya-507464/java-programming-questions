package org.example;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        System.out.printf("Numbers before swapping a = %s,  b = %s %n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("Numbers after swapping a = %s,  b = %s", a, b);
    }
}
