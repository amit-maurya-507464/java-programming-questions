package org.example.string;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String stringWithSpaces = "Hello World!";

        String stringWithoutSpaces = removeWhiteSpaces(stringWithSpaces);

        System.out.println(stringWithoutSpaces);
    }

    private static String removeWhiteSpaces(String stringWithSpaces) {
        char[] charArray = stringWithSpaces.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charArray) {
//            if (c != ' ') stringBuilder.append(c);
            if (!Character.isWhitespace(c)) stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
