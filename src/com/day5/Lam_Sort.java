
package com.day5;

import java.util.Arrays;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " = " + salary;
    }
}

public class Lam_Sort {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Rajan", 55000),
            new Employee("Vikram", 75000),
            new Employee("Anita", 60000),
            new Employee("Priya", 50000)
        };
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Employees sorted by Salary (Ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
