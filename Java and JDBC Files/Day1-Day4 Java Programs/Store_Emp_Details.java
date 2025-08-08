package wd;

import java.util.Scanner;

class Emp {
	String name;
	int emp_id;
	double salary;

	void details() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();

		System.out.print("Enter employee ID : ");
		emp_id = sc.nextInt();

		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();

	}
	void display() {
		System.out.println("\nEmployee Details :- ");
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Salary : Rs " + salary);
	}
}

public class Store_Emp_Details {
	public static void main(String[] args) {
		Emp e=new Emp();
		e.details();
		e.display();
	}

}
