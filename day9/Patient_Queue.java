package com.day9;

import java.util.LinkedList;
import java.util.Scanner;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String display() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Patient_Queue {
    public static void main(String[] args) {
        LinkedList<Patient> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Hospital Queue :- ");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add patient (normal)");
            System.out.println("2. Add emergency patient");
            System.out.println("3. Cancel appointment by ID");
            System.out.println("4. View first and last patient");
            System.out.println("5. View all patients");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter patient name: ");
                    String name1 = sc.nextLine();
                    queue.addLast(new Patient(id1, name1));
                    System.out.println("Patient added to queue.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter patient name: ");
                    String name2 = sc.nextLine();
                    queue.addFirst(new Patient(id2, name2));
                    System.out.println("Emergency patient added to front.");
                    break;

                case 3:
                    System.out.print("Enter patient ID to cancel: ");
                    int cancelId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < queue.size(); i++) {
                        if (queue.get(i).id == cancelId) {
                            System.out.println("Appointment cancelled for: " + queue.get(i).name);
                            queue.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No patient found with ID " + cancelId);
                    }
                    break;

                case 4:
                    if (!queue.isEmpty()) {
                        System.out.println("First: " + queue.getFirst());
                        System.out.println("Last : " + queue.getLast());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in the queue.");
                    } else {
                        System.out.println("Patients in queue:");
                        for (Patient p : queue) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
