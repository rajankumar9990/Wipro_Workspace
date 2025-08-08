package com.day11.treemap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


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

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class Patient_Appointment {
    public static void main(String[] args) {
        TreeMap<Integer, Patient> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Patient Appointment Scheduler ---");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. View Next and Last Appointment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Time Slot (use 24-hr format like for 1:00 use 100): ");
                    int timeSlot = sc.nextInt();
                    sc.nextLine();

                    if (appointments.containsKey(timeSlot)) {
                        System.out.println("Appointment already exists at that time.");
                    } else {
                        System.out.print("Enter Patient ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Patient Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();
                        appointments.put(timeSlot, new Patient(id, name, disease));
                        System.out.println("Appointment added.");
                    }
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        System.out.println("\nScheduled Appointments (in order):");
                        for (Map.Entry<Integer, Patient> entry : appointments.entrySet()) {
                            System.out.println("Time Slot: " + entry.getKey() + " => " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Time Slot to remove: ");
                    int removeSlot = sc.nextInt();
                    if (appointments.remove(removeSlot) != null) {
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("No appointment found at that time.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Current Time Slot: ");
                    int currentSlot = sc.nextInt();
                    if (!appointments.containsKey(currentSlot)) {
                        System.out.println("No appointment found at that time.");
                    } else {
                        sc.nextLine();
                        System.out.print("Enter New Time Slot: ");
                        int newSlot = sc.nextInt();
                        if (appointments.containsKey(newSlot)) {
                            System.out.println("Another appointment exists at new time.");
                        } else {
                            Patient patient = appointments.remove(currentSlot);
                            appointments.put(newSlot, patient);
                            System.out.println("Appointment rescheduled.");
                        }
                    }
                    break;

                case 5:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        System.out.println("Next Appointment: " + appointments.firstKey() + " => " + appointments.firstEntry().getValue());
                        System.out.println("Last Appointment: " + appointments.lastKey() + " => " + appointments.lastEntry().getValue());
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
