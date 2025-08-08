package com.day11.filehandling;

import java.io.*;
import java.util.Scanner;

public class Patients_Records {

	static final String file = "patients.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nPatient Records System :- ");
			System.out.println("1. Add Patient Record");
			System.out.println("2. View All Records");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addPatient(sc);
				break;
			case 2:
				displayPatients();
				break;
			case 3:
				System.out.println("Exiting the system...");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}

		} while (choice != 3);

		sc.close();
	}

	static void addPatient(Scanner sc) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
			System.out.print("Enter Patient ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Disease: ");
			String disease = sc.nextLine();

			// saving patient data in comma-separated format 
			String record = id + "," + name + "," + disease;
			writer.write(record);
			writer.newLine();

			System.out.println("Patient record added successfully!");

		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}

	static void displayPatients() {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			System.out.println("\nAll Patient Records");
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Disease: " + parts[2]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No patient records found. File doesn't exist yet.");
		} catch (IOException e) {
			System.out.println("Error reading from file: " + e.getMessage());
		}
	}
}
