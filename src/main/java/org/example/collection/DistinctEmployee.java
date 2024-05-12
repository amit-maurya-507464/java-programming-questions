package org.example.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MyEmployee {
    private int id;
    private String name;

    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyEmployee employee = (MyEmployee) obj;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return 31 * id + name.hashCode();
    }
}

public class DistinctEmployee {
    public static void main(String[] args) {
        List<MyEmployee> employees = new ArrayList<>();
        employees.add(new MyEmployee(1, "John"));
        employees.add(new MyEmployee(2, "Alice"));
        employees.add(new MyEmployee(1, "John")); // Duplicate
        employees.add(new MyEmployee(3, "Bob"));
        employees.add(new MyEmployee(2, "Alice")); // Duplicate

        List<MyEmployee> uniqueEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Employees:");
        uniqueEmployees.forEach(employee -> System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName()));
    }
}
