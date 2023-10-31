package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static char findFirstRepeatingCharacter(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "programming";
//        char firstRepeatingChar = findFirstRepeatingCharacter(inputString);
        char firstRepeatingChar = findFirstRepeatingCharacterUsingJava8(inputString);

        if (firstRepeatingChar != '\0') {
            System.out.println("The first repeating character is: " + firstRepeatingChar);
        } else {
            System.out.println("No repeating characters found.");
        }
    }

    private static char findFirstRepeatingCharacterUsingJava8(String str) {
            Set<Character> seen = new HashSet<>();
             return str.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> !seen.add(c))
                    .findFirst().orElse('\0');
    }
}

