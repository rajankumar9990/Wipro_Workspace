package com.hashset2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Patient {
	private String id;
	private String name;

	public Patient(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Patient patient = (Patient) obj;
		return Objects.equals(id, patient.id); // comparing only ID
	}

	@Override
	public int hashCode() {
		return Objects.hash(id); // hash based on ID only
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
}

public class Patients_Reg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Patient> patients = new HashSet<>();

		while (true) {
			System.out.println("\nHospital Patient Registration");
			System.out.println("1. Register Patient");
			System.out.println("2. View Registered Patients");
			System.out.println("3. Remove Patient");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				String id = sc.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();
				Patient newPatient = new Patient(id, name);
				if (patients.contains(newPatient)) {
					System.out.println("Patient with this ID is already registered.");
				} else {
					patients.add(newPatient);
					System.out.println("Patient registered successfully.");
				}
				break;

			case 2:
				if (patients.isEmpty()) {
					System.out.println("No patients registered.");
				} else {
					System.out.println("\nRegistered Patients:");
					for (Patient p : patients) {
						System.out.println(p);
					}
				}
				break;

			case 3:
				System.out.print("Enter Patient ID to remove: ");
				String removeId = sc.nextLine();
				Patient toRemove = new Patient(removeId, "dummy"); 
				if (patients.remove(toRemove)) {
					System.out.println("Patient removed successfully.");
				} else {
					System.out.println("Patient ID not found.");
				}
				break;

			case 4:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
