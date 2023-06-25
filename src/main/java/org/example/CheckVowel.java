package org.example;

public class CheckVowel {

    public static void main(String[] args) {

        String string = "HEllO";
        String regex = ".[aeiou].*";

        boolean matches = string.toLowerCase().matches(regex);

        System.out.println(matches);
    }
}
