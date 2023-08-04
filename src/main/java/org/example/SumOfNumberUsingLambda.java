package org.example;

interface Adder {
    int add(int a, int b);
}

public class SumOfNumberUsingLambda {

    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        Adder adder2 = Integer::sum;
        int num1 = 5;
        int num2 = 10;
        int sum = adder.add(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
