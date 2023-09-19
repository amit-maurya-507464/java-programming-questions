package org.example.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringIsogram {

    public static void main(String[] args) {

        String s = "javaisaprogramminglanguage";

        printLargestIsogramSubstring(s);

    }

    private static void printLargestIsogramSubstring(String s) {
        String largestSubstring = "";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            StringBuilder substring = new StringBuilder(String.valueOf(charArray[i]));
            Map<Character, Integer> map = new HashMap<>();
            map.put(charArray[i], 1);
            for (int j = i+1; j < charArray.length; j++) {
                if (map.containsKey(charArray[j])) {
                    break;
                } else {
                    map.put(charArray[j], 1);
                    substring.append(charArray[j]);
                }
            }
            if (largestSubstring.length() < substring.length()) {
                largestSubstring = substring.toString();
            }
        }
        System.out.println(largestSubstring);
    }
}
