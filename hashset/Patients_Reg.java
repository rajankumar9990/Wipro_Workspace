package com.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Patients_Reg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> patients = new HashSet<>();  // Only storing patient IDs

        while (true) {
            System.out.println("\nPatient Registration :- ");
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

                    if (patients.contains(id)) {
                        System.out.println("Patient ID already registered.");
                    } else {
                        patients.add(id);
                        System.out.println("Patient registered successfully.");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        System.out.println("\nRegistered Patient IDs:");
                        for (String patientId : patients) {
                            System.out.println("ID: " + patientId);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to remove: ");
                    String removeId = sc.nextLine();
                    
                    if (patients.remove(removeId)) {
                        System.out.println("Patient ID removed successfully.");
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting!!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!! Try Again!!");
            }
        }
    }
}
