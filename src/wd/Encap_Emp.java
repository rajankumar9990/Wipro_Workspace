package wd;
import java.util.Scanner;

class emp {
    private String name;
    private double salary;

 
    public void setName(String n) {
        this.name = n;
    }

 
    public String getName() {
        return name;
    }

 
    public void setSalary(double s) {
        this.salary = s;
    }

 
    public double getSalary() {
        return salary;
    }
}

public class Encap_Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp e1 = new emp();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        e1.setName(empName);
        e1.setSalary(empSalary);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: Rs " + e1.getSalary());

        sc.close();
    }
}
