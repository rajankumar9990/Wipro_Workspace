//employee management system use case-inheritance and polymorphism
package com.day19;
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + ", Dept: " + department + ", Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLang;

    public Developer(String name, int id, double salary, String programmingLang) {
        super(name, id, salary);
        this.programmingLang = programmingLang;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer: " + name + ", Language: " + programmingLang + ", Salary: " + salary);
    }
}

public class Empl_Manag_Syst {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter Manager Name, ID, Salary, Department:");
        String mName = sc.nextLine();
        int mId = sc.nextInt();
        double mSalary = sc.nextDouble();
        sc.nextLine(); 
        String dept = sc.nextLine();

   
        System.out.println("Enter Developer Name, ID, Salary, Programming Language:");
        String dName = sc.nextLine();
        int dId = sc.nextInt();
        double dSalary = sc.nextDouble();
        sc.nextLine(); 
        String lang = sc.nextLine();

        Employee e1 = new Manager(mName, mId, mSalary, dept);
        Employee e2 = new Developer(dName, dId, dSalary, lang);

        System.out.println("\n---------Employee Details-----------");
        e1.displayDetails();
        e2.displayDetails();

        sc.close();
    }

}
