package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateStringFromArray {

    public static void main(String[] args) {

        String[] strings = {"Banana", "Apple", "Banana", "Mango", "Avocado", "Apricot", "Banana", "Grapes"};
        removeDuplicateElements(strings);
        removeDuplicateElementsWithOrder(strings);
        removeDuplicateElementsWithJava8(strings);

    }

    public static void removeDuplicateElements(String[] strings) {
        Set<String> stringSet = new HashSet<>(List.of(strings));
        System.out.println(stringSet);
    }

    public static void removeDuplicateElementsWithOrder(String[] strings) {
        Set<String> stringSet = new LinkedHashSet<>(List.of(strings));
        System.out.println(stringSet);
    }

    public static void removeDuplicateElementsWithJava8(String[] strings) {
        List<String> stringList = Arrays.stream(strings).distinct().collect(Collectors.toList());
        System.out.println(stringList);
    }

}
