package org.example.numbers;

import java.util.Scanner;

public class ArmstrongNumbers {

    //Armstrong number is a number that is equal to the sum of cubes of its digits.

    public static void main(String[] args) {

        System.out.println("Enter Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        checkArmstrong(num);
    }

    private static void checkArmstrong(int num) {
        int pow = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while(temp!=0) {
            int remainder = temp % 10;
            temp = temp / 10;
            sum += (int) Math.pow(remainder, pow);
        }
        if (num==sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
