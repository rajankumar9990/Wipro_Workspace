package com.day12;

import java.io.*;
import java.util.Scanner;

// Patient class implements Serializable for object serialization
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

	// Override toString() for readable output
	public String toString() {
		return id + " - " + name + " - " + disease + " - " + age;
	}
}

public class Patients_Serialization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID:");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Name:");
		String name = sc.nextLine();

		System.out.println("Enter Disease:");
		String disease = sc.nextLine();

		System.out.println("Enter Age:");
		int age = sc.nextInt();

		Patient p = new Patient(id, name, disease, age);

		// Serialize the patient object to a file
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patient.dat"));
			out.writeObject(p);
			out.close();
			System.out.println("Patient saved.");
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

		// Deserialize the patient object from the file
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("patient.dat"));
			Patient savedPatient = (Patient) in.readObject();
			in.close();
			System.out.println("Saved Patient:");
			System.out.println(savedPatient);
		} catch (Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}
