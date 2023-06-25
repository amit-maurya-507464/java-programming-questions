package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMerge {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(4,5,6,7,8,9,10,11));

        List<Integer> mergedList = mergeList(integerList1, integerList2);
        System.out.println("Merged list " + mergedList);

        Set<Integer> uniqueList = findUniqueList(mergedList);

        System.out.println("Unique List " + uniqueList);

        Integer min = uniqueList.stream().min((t1, t2) -> t1 - t2).get();
        System.out.println("Minimum number " + min);

        Integer max = uniqueList.stream().max((integer, t1) -> integer - t1).get();
        System.out.println("Maximum number " + max);


    }

    private static Set<Integer> findUniqueList(List<Integer> mergedList) {
        return mergedList.stream().collect(Collectors.toSet());
    }

    private static List<Integer> mergeList(List<Integer> integerList1, List<Integer> integerList2) {
        return Stream.concat(integerList1.stream(), integerList2.stream())
                .collect(Collectors.toList());
    }
}
