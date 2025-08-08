package com.day10.hashmap;

import java.util.HashMap;
import java.util.Scanner;


class Patient {
    private int id;
    private String name;
    private String disease;

    public Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}


public class Patients_Reg {
    public static void main(String[] args) {
        HashMap<Integer, Patient> patientMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPatients Data :- ");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient Details");
            System.out.println("3. List All Patients");
            System.out.println("4. Retrieve Patient by ID");
            System.out.println("5. Clear All Records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    patientMap.put(id, new Patient(id, name, disease));
                    System.out.println("Patient added.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    if (patientMap.containsKey(updateId)) {
                        Patient p = patientMap.get(updateId);
                        System.out.print("Enter new name: ");
                        p.setName(sc.nextLine());
                        System.out.print("Enter new disease: ");
                        p.setDisease(sc.nextLine());
                        System.out.println("Patient updated.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nAll Patients:");
                    if (patientMap.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Patient p : patientMap.values()) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to retrieve: ");
                    int retrieveId = sc.nextInt();
                    if (patientMap.containsKey(retrieveId)) {
                        System.out.println("Patient Found: " + patientMap.get(retrieveId));
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 5:
                    patientMap.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
