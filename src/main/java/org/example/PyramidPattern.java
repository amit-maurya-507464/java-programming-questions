package org.example;

public class PyramidPattern {

    public static void main(String[] args) {

        int num = 5;

        System.out.println("Printing diamond pattern");
        printDiamondPattern(num);

        System.out.println("Printing hallow diamond pattern");
        printHallowDiamondPattern(num);

        System.out.println("Printing number diamond pattern");
        printNumberDiamondPattern(num);
    }

    private static void printNumberDiamondPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        for (int i = num-1; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    private static void printHallowDiamondPattern(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                if (k==0 || k == i*2-2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = num-1; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                if (k==0 || k == i*2-2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printDiamondPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-1; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
