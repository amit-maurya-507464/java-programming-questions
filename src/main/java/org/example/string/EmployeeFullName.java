package org.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class EmployeeFullName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe"),
                new Employee("Jane", "Smith"),
                new Employee("Alice", "Johnson")
        );

        // Using Java 8 Stream API
        List<String> fullNames = employees.stream()
                .map(e -> e.firstName + " " + e.lastName)
                .collect(Collectors.toList());

        // Print full names
        fullNames.forEach(System.out::println);
    }
}
