package org.example.comparator;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Amit", 25));
        employeeList.add(new Employee(5, "Anuj", 20));
        employeeList.add(new Employee(8, "Anju", 21));
        employeeList.add(new Employee(2, "Aashi", 24));

        //By id
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);

        System.out.println("###############################################");

        //By name
        Collections.sort(employeeList, new NameComparator());
        employeeList.forEach(System.out::println);

        System.out.println("###############################################");

        //By Age
        Collections.sort(employeeList, new AgeComparator());
        employeeList.forEach(System.out::println);

        System.out.println("###############################################");

        //By Age in reverse order
        Collections.sort(employeeList, Collections.reverseOrder(new AgeComparator()));
        employeeList.forEach(System.out::println);
    }
}
