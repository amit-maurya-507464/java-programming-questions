package org.example.miscellaneous;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // Define a predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Test the predicate with various inputs
        System.out.println(isEven.test(5));  // Output: false
        System.out.println(isEven.test(10)); // Output: true

        // Define predicates
        Predicate<Integer> isPositive = num -> num > 0;

        // Combine predicates using logical operators
        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);

        // Test the combined predicate
        System.out.println(isEvenAndPositive.test(6));  // Output: true
        System.out.println(isEvenAndPositive.test(-3)); // Output: false

    }


}
