package org.example.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListShuffle {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        int[] arrayData = {1, 2, 3, 4, 5};

        arrayData = listShuffle(arrayData);

        Collections.shuffle(data);

        System.out.println(data);
        System.out.println(Arrays.toString(arrayData));

    }

    private static int[] listShuffle(int[] arrayData) {
        Random random = new Random();
        for (int i = 0; i < arrayData.length ; i++) {
            int randomIndex = random.nextInt(arrayData.length);
            int temp = arrayData[randomIndex];
            arrayData[randomIndex] = arrayData[i];
            arrayData[i] = temp;
        }
        return arrayData;
    }


}
