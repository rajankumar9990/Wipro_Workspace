package com.day8;
import java.util.*;

class Patient {
	int id;
	String name;
	int age;
	String disease;

	Patient(int id, String name, int age, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
	}
}

public class Hospital_OPD2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patients = new ArrayList<>();

		while (true) {
			System.out.println("\n1. Add Patient");
			System.out.println("2. View All");
			System.out.println("3. Search by ID");
			System.out.println("4. Delete by ID");
			System.out.println("5. Total Patients");
			System.out.println("6. Clear All Records");
			System.out.println("7. Exit");
			System.out.print("Choose: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Disease: ");
				String disease = sc.nextLine();
				patients.add(new Patient(id, name, age, disease));
				System.out.println("Patient Added.");
				break;

			case 2:
				if (patients.isEmpty())
					System.out.println("No patients.");
				else
					for (Patient p : patients)
						p.display();
				break;

			case 3:
				System.out.print("Enter ID: ");
				int searchId = sc.nextInt();
				boolean found = false;
				for (Patient p : patients) {
					if (p.id == searchId) {
						p.display();
						found = true;
						break;
					}
				}
				if (!found)
					System.out.println("Patient not found.");
				break;

			case 4:
				System.out.print("Enter ID to delete: ");
				int deleteId = sc.nextInt();
				boolean removed = false;

				for (int i = 0; i < patients.size(); i++) {
					if (patients.get(i).id == deleteId) {
						patients.remove(i);
						removed = true;
						break;
					}
				}

				if (removed)
					System.out.println("Patient Removed.");
				else
					System.out.println("Patient not found.");
				break;

			case 5:
				System.out.println("Total Patients: " + patients.size());
				break;

			case 6:
				patients.clear();
				System.out.println("All patient records cleared.");
				break;

			case 7:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
