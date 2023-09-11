package org.example.numbers;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;

        checkPalindromeWithStringBuilder(num);
        checkPalindromeWithStringChar(num);
        checkPalindrome(num);
    }

    private static void checkPalindrome(int num) {
        int reverseNum = 0;
        int number = num;
        while (num>0) {
            int remainder = num % 10;
            num = num / 10;
            reverseNum = reverseNum * 10 + remainder;
        }
        if (number==reverseNum) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

    private static void checkPalindromeWithStringChar(int num) {
        String string = String.valueOf(num);
        char[] charArray = string.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }

    private static void checkPalindromeWithStringBuilder(int num) {
        String string = String.valueOf(num);
        String reverseString = new StringBuilder(string).reverse().toString();
        if (string.equals(reverseString)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }


}
