package org.example;

import java.util.*;

public class HashMapSortByValue {

    public static void main(String[] args) {

        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 25);
        unsortedMap.put("Bob", 30);
        unsortedMap.put("Charlie", 20);
        unsortedMap.put("David", 35);
        System.out.println("Unsorted Map");
        System.out.println(unsortedMap);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
//        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        entryList.forEach(stringIntegerEntry -> sortedMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
        System.out.println("Sorted Map");
        System.out.println(sortedMap);
    }
}
