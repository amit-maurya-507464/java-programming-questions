package org.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    //An anagram is a word or phrase created by rearranging the letters of another word or phrase, usually using all the original letters exactly once.

    public static void main(String[] args) {

        String string1 = "earth";
        String string2 = "heart";

        boolean isAnagram = checkIfAnagram(string1, string2);
//        boolean isAnagram = checkIfAnagramUsingHashMap(string1, string2);

        if (isAnagram) System.out.println("Both strings are anagrams");
        else System.out.println("Both strings are not anagrams");
    }

    private static boolean checkIfAnagramUsingHashMap(String string1, String string2) {
        if (string1.length()!=string2.length()) return false;
        char[] string1CharArray = string1.toCharArray();
        char[] string2CharArray = string2.toCharArray();
        Map<Character, Integer> string1Map = new HashMap<>();
        Map<Character, Integer> string2Map = new HashMap<>();
        for (char c : string1CharArray) {
            if (string1Map.containsKey(c)) {
                string1Map.put(c, string1Map.get(c)+1);
            } else {
                string1Map.put(c, 1);
            }
        }
        for (char c : string2CharArray) {
            if (string2Map.containsKey(c)) {
                string2Map.put(c, string2Map.get(c)+1);
            } else {
                string2Map.put(c, 1);
            }
        }
        boolean isAnagram = true;
        for (Map.Entry<Character, Integer> entry : string1Map.entrySet()) {
            Character character = entry.getKey();
            Integer integer = entry.getValue();
            if (string2Map.containsKey(character)) {
                if (!string2Map.get(character).equals(integer)) {
                    isAnagram = false;
                }
            } else {
                isAnagram = false;
            }
        }
        return isAnagram;
    }

    private static boolean checkIfAnagram(String string1, String string2) {
        if (string1.length()!=string2.length()) return false;
        char[] string1CharArray = string1.toCharArray();
        char[] string2CharArray = string2.toCharArray();
        Arrays.sort(string1CharArray);
        Arrays.sort(string2CharArray);
        return Arrays.equals(string1CharArray, string2CharArray);
    }
}
