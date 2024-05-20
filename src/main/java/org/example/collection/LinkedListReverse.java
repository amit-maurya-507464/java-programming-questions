package org.example.collection;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListReverse {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1, 3 ,5 ,9));
        LinkedList<Integer> reverseList = new LinkedList<>();

//        Iterator<Integer> iterator = integerList.descendingIterator();
//        while (iterator.hasNext()) {
//            reverseList.add(iterator.next());
//        }

//        ListIterator<Integer> iterator = integerList.listIterator(integerList.size());
//        while (iterator.hasPrevious()) {
//            reverseList.add(iterator.previous());
//        }

//        integerList.descendingIterator().forEachRemaining(reverseList::add);

//        Collections.reverse(integerList);
        integerList = reverseLinkedList(integerList);
        System.out.println(integerList);

//        System.out.println(reverseList);

    }

    public static LinkedList<Integer> reverseLinkedList(List<Integer> linkedList) {
        return linkedList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
