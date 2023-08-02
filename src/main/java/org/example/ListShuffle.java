package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListShuffle {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);

        Collections.shuffle(data);

        System.out.println(data);

    }

}
