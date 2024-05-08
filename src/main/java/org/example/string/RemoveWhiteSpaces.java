package org.example.string;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String stringWithSpaces = "Hello World!";

        String stringWithoutSpaces = removeWhiteSpaces(stringWithSpaces);
        stringWithoutSpaces = removeWhiteSpacesWithReplaceAll(stringWithSpaces);
        stringWithoutSpaces = removeWhiteSpacesWithReplace(stringWithSpaces);

        System.out.println(stringWithoutSpaces);
    }

    private static String removeWhiteSpacesWithReplace(String stringWithSpaces) {
        return stringWithSpaces.replace(" ", "");
    }

    private static String removeWhiteSpacesWithReplaceAll(String stringWithSpaces) {
        return stringWithSpaces.replaceAll("\\s", "");
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
