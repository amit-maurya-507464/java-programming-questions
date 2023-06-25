package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1, 3 ,5 ,9));
        LinkedList<Integer> reverseList = new LinkedList<>();

        integerList.descendingIterator().forEachRemaining(reverseList::add);

        System.out.println(reverseList);

    }
}
