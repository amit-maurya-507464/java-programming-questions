package org.example.string;

public class LongestSubstringOfSameChars {

    public static String findLongestSubstringOfSameChars(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Return an empty string for empty or null input.
        }

        int maxStart = 0;   // Starting index of the longest substring found so far.
        int maxEnd = 0;     // Ending index of the longest substring found so far.
        int currentStart = 0; // Starting index of the current substring.
        int currentLength = 1; // Length of the current substring.

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentLength++;
                if (currentLength > maxEnd - maxStart + 1) {
                    maxStart = currentStart;
                    maxEnd = i;
                }
            } else {
                currentStart = i;
                currentLength = 1;
            }
        }

        return input.substring(maxStart, maxEnd + 1);
    }

    public static void main(String[] args) {
        String input = "aaabbbbccccdddeeeeeee";
        String longestSubstring = findLongestSubstringOfSameChars(input);
        System.out.println("Input String: " + input);
        System.out.println("Longest Substring of Same Characters: " + longestSubstring);
    }
}
