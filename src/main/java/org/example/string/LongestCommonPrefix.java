package org.example.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strings = {"fliwer","fliw","flight"};
        String longestPrefix = findLongestPrefix(strings);
        System.out.println(longestPrefix);
    }

    private static String findLongestPrefix(String[] strings) {
        String longestPrefix = "";
        boolean isCommonPrefix = true;
        int subStringCount = 1;
        for (int i = 0; i < strings.length-1; i++) {
            String string = strings[i];
            String subString = string.substring(0, subStringCount);
            for (int j = i+1; j < strings.length; j++) {
                String stringCompare = strings[j];
                String subStringCompare = stringCompare.substring(0, subStringCount);
                if (!subString.equals(subStringCompare)) {
                    isCommonPrefix = false;
                    break;
                }
            }
            if (!isCommonPrefix) break;
            longestPrefix = subString;
            subStringCount++;
        }
        return longestPrefix;
    }

}
