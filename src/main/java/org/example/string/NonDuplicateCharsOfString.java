package org.example.string;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicateCharsOfString {

    public static void main(String[] args) {

        String string = "abcabs";

        Map<Character, Long> map = string.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (map.get(c)==1) {
                result.append(c);
            }
        }

        System.out.println(result);

    }
}
