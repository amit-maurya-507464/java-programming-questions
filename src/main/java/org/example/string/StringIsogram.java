package org.example.string;

import java.util.*;

public class StringIsogram {

    public static void main(String[] args) {

        String string = "education";

        boolean isIsogram = checkIfIsogramWithJava8(string);

        System.out.println(isIsogram);
    }

    private static boolean checkIfIsogram(String string) {
        char[] charArray = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c: charArray) {
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, 1);
        }
        return true;
    }

    private static boolean checkIfIsogramWithJava8(String str) {
        str = str.toLowerCase();
        return str.chars()
//                .filter(Character::isLetter)
                .distinct()
                .count() == str.chars()
//                .filter(Character::isLetter)
                .count();
    }

}
