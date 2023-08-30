package org.example.string;

public class Palindrome {

    public static void main(String[] args) {

        String text = "wow";
        boolean isPalindrome = checkIfPalindrome(text);
        if (isPalindrome)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }

    private static boolean checkIfPalindrome(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i] != charArray[charArray.length-i-1]) return false;
        }
        return true;
    }
}
