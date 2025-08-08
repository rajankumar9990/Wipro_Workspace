package com.day10;

import java.util.HashSet;
import java.util.Scanner;

class Doctor {
	private int license_num;
	private String name;
	private String dept;

	public Doctor(int license_num, String name, String dept) {
		this.license_num = license_num;
		this.name = name;
		this.dept = dept;

	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Doctor))
			return false;
		Doctor doctor = (Doctor) o;
		return license_num == doctor.license_num;
	}

	public int hashCode() {
		return Integer.hashCode(license_num);
	}

	public String toString() {
		return "Doctor License Number: " + license_num + ", Name: " + name + ", Department: " + dept;
	}
}

public class Doctors_Reg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Doctor> doctorSet = new HashSet<>();
		System.out.println("Welcome to Doctor Registraion!!");
		while (true) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Register a New Doctor");
			System.out.println("2. Display All Registered Doctors");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("\nEnter Doctor Details:");
				System.out.print("License Number: ");
				int license = sc.nextInt();
				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Department: ");
				String dept = sc.nextLine();

				Doctor doctor = new Doctor(license, name, dept);

				if (doctorSet.contains(doctor)) {
					System.out.println("\nDoctor with License Number " + license + " is already registered.");
				} else {
					doctorSet.add(doctor);
					System.out.println("Doctor registered successfully!");
				}
				break;

			case 2:
				System.out.println("\nList of Registered Doctors:");
				if (doctorSet.isEmpty()) {
					System.out.println("No doctors registered yet.");
				} else {
					for (Doctor d : doctorSet) {
						System.out.println(d);
					}
				}
				break;

			case 3:
				System.out.println("Exiting the system. Thank you!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please select from 1 to 3.");

			}

		}
	}
}
