package com.day8;

import java.util.Scanner;

public class Form_Validate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("\nEnter your age : ");
		String ageInput = sc.nextLine();
		Integer ageObj = Integer.valueOf(ageInput); // autoboxing-string to integer
		int age = ageObj; // unboxing-Integer to int

		System.out.println("\nEnter your marks : ");
		String marksInput = sc.nextLine();
		Double marksObj = Double.valueOf(marksInput); // autoboxing - string to double
		double marks = marksObj; // unboxing-Double to double

		System.out.println("\nDo you want to submit the form?(true/false) : ");
		String submitInput = sc.nextLine();
		Boolean submitObj = Boolean.valueOf(submitInput); // autoboxing
		boolean submit = submitObj;

		System.out.println("\nForm Details : ");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + marks);
		System.out.println("Submit : " + (submit ? "Yes" : "No"));
		sc.close();

	}

}
