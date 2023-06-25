package org.example;

public class StringReverse {
    public static void main(String[] args) {
        String string = "Hello World!";
//        String reverseString = reverseStringWithLoop(string);
        String reverseString = reverseStringWithFunction(string);
        System.out.println(reverseString);
    }

    private static String reverseStringWithFunction(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private static String reverseStringWithLoop(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = string.toCharArray();
        for (int i = charArray.length-1;  i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }
}
