package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class MinimumWeightShipped {
    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int minimumWeight = 0;
        for (int weight : weights) {
            if (weight > minimumWeight) {
                minimumWeight = weight;
            }
        }

        int maximumWeight = 0;

        for (int weight : weights) {
            maximumWeight += weight;
        }

        List<Integer> allPossibleAnswers = new ArrayList<>();

        for (int i = minimumWeight; i<= maximumWeight; i++) {
            allPossibleAnswers.add(i);
        }

        int bestAnswer =  findBestAnswer(weights, days, allPossibleAnswers);


        System.out.println(bestAnswer);



    }

    private static int findBestAnswer(int[] weights, int days, List<Integer> allPossibleAnswers) {

        int min = 0;
        int max = allPossibleAnswers.size() -1;
        while (true) {
            int mid = (min + max) / 2;
            int solutionExpected = allPossibleAnswers.get(mid);
            int maxWeightShipped = 0;
            int daysUsed = 1;
            for (int weight : weights) {
                if (maxWeightShipped+weight <= solutionExpected) {
                    maxWeightShipped += weight;
                } else {
                    daysUsed++;
                    maxWeightShipped = weight;
                }
                if (daysUsed > days) {
                    break;
                }
            }
            if (daysUsed==days) {
                return solutionExpected;
            } else if (daysUsed>days) {
                min = mid+1;
            } else {
                max = mid-1;
            }

        }
    }

}