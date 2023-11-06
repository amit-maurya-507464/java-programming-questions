package org.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private final int id;
    private final String name;
    private final String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + '}';
    }
}

public class EmployeeMapWithDepartmentExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "HR"));
        employees.add(new Employee(2, "Jane Smith", "IT"));
        employees.add(new Employee(3, "Bob Johnson", "HR"));
        employees.add(new Employee(4, "Alice Jones", "IT"));

//        Map<String, List<Employee>> departmentMap = mapEmployeesWithDepartment(employees);
        Map<String, List<Employee>> departmentMap = mapEmployeesWithDepartmentWithStream(employees);

        // Print the result
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Employees: " + entry.getValue());
            System.out.println();
        }
    }

    private static Map<String, List<Employee>> mapEmployeesWithDepartmentWithStream(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    private static Map<String, List<Employee>> mapEmployeesWithDepartment(List<Employee> employees) {
        // Create a map with department name as key and list of employees as values
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            // If the department is not already a key in the map, add it with an empty list
            departmentMap.putIfAbsent(employee.getDepartment(), new ArrayList<>());

            // Add the employee to the list associated with their department
            departmentMap.get(employee.getDepartment()).add(employee);
        }
        return departmentMap;
    }

}
