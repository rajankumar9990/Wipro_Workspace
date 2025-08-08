package com.day12.ser;

import java.io.*;
import java.util.*;

class Patient implements Serializable {
	int id;
	String name;
	String disease;
	int age;

	public Patient(int id, String name, String disease, int age) {
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}

	public String toString() {
		return id + " - " + name + " - " + disease + " - " + age;
	}
}

public class Patients_Serial {
	static final String file_name = "patients.dat";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patients = loadPatients(); // Load existing patients

		while (true) {
			
			System.out.println("1. Save new patient");
			System.out.println("2. View all patients");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
				case 1:
					System.out.print("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Disease: ");
					String disease = sc.nextLine();

					System.out.print("Enter Age: ");
					int age = sc.nextInt();
					sc.nextLine();

					Patient newPatient = new Patient(id, name, disease, age);//new patient object
					patients.add(newPatient);
					savePatients(patients);
					System.out.println("Patient saved.");
					break;

				case 2:
					if (patients.isEmpty()) {
						System.out.println("No patients found.");
					} else {
						System.out.println("\nSaved Patients:");
						for (Patient p : patients) {
							System.out.println(p);
						}
					}
					break;

				case 3:
					System.out.println("Exiting!");
					return;

				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}

	// Method to save the entire list of patients
	static void savePatients(ArrayList<Patient> patients) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file_name))) {
			out.writeObject(patients);
		} catch (IOException e) {
			System.out.println("Error writing to file.");
		}
	}

	// Method to load patients from file (if exists)
	static ArrayList<Patient> loadPatients() {
		File file = new File(file_name);
		if (!file.exists()) {     //checks if files exist with same name or not
			return new ArrayList<>();  //if not .it will return an empty list
		}
       //for reading arraylist
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
			return (ArrayList<Patient>) in.readObject();
		} catch (Exception e) {
			System.out.println("Error reading from file. Starting with an empty list.");
			return new ArrayList<>();
		}
	}
}
