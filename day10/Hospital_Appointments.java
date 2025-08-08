package com.day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

class Appointment implements Comparable<Appointment> {
	private String patientName;
	private LocalDateTime dateTime;

	public Appointment(String patientName, LocalDateTime dateTime) {
		this.patientName = patientName;
		this.dateTime = dateTime;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public String getPatientName() {
		return patientName;
	}

	@Override
	public int compareTo(Appointment other) {
		return this.dateTime.compareTo(other.dateTime); // sort by date/time
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Appointment))
			return false;
		Appointment other = (Appointment) obj;
		return this.dateTime.equals(other.dateTime);
	}

	@Override
	public int hashCode() {
		return dateTime.hashCode();
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return patientName + " - " + dateTime.format(fmt);
	}
}

public class Hospital_Appointments {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Appointment> appointments = new TreeSet<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		System.out.print("How many appointments do you want to schedule? ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("\nEnter details for appointment #" + i);

			System.out.print("Patient Name: ");
			String name = sc.nextLine();

			System.out.print("Date & Time (dd-MM-yyyy HH:mm): ");
			String dateTimeInput = sc.nextLine();

			try {
				LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput, formatter);
				Appointment appt = new Appointment(name, dateTime);
				boolean added = appointments.add(appt);

				if (!added) {
					System.out.println("Appointment at this time already exists! Skipping duplicate.");
				}
			} catch (Exception e) {
				System.out.println("❌ Invalid date/time format! Please use dd-MM-yyyy HH:mm");
				i--; // ask again for same appointment
			}
		}

		System.out.println("\nScheduled Appointments (Chronological Order):");
		for (Appointment appt : appointments) {
			System.out.println("🔸 " + appt);
		}

		if (!appointments.isEmpty()) {
			System.out.println("\nEarliest Appointment: " + appointments.first());
			System.out.println("Latest Appointment: " + appointments.last());
		}
	}
}
