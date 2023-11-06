package org.example.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        // Example 1: FlatMap with Stream of Lists
        List<String> list1 = Arrays.asList("java", "python");
        List<String> list2 = Arrays.asList("c", "c++");
        List<String> list3 = Arrays.asList("ruby", "javascript");

        List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);

        // Using flatMap to flatten the list of lists into a single stream
        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened List: " + flatList);

        // Example 2: FlatMap with Stream of Arrays
        String[][] data = {{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Using flatMap to flatten the array of arrays into a single stream
        List<String> flatArray = Arrays.stream(data)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened Array: " + flatArray);

        // Example 3: FlatMap with Stream of Objects
        class Person {
            final String name;
            final List<String> hobbies;

            Person(String name, List<String> hobbies) {
                this.name = name;
                this.hobbies = hobbies;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("reading", "painting")),
                new Person("Bob", Arrays.asList("coding", "gaming", "cooking")),
                new Person("Charlie", Arrays.asList("cooking", "traveling"))
        );

        // Using flatMap to flatten the list of objects into a single stream of hobbies
        Set<String> allHobbies = people.stream()
                .flatMap(person -> person.hobbies.stream())
                .collect(Collectors.toSet());

        System.out.println("All Hobbies: " + allHobbies);
    }
}
