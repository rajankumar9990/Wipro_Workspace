package com.healthcare.module;

public class Patient_Ser_Imp implements Patient_Ser {
	private Patient_Reg[] patients;
	private int count = 0;

	public Patient_Ser_Imp(int capacity) {
		patients = new Patient_Reg[capacity];
	}

	public void reg_Patient(Patient_Reg patient) {
		if (count < patients.length) {
			patients[count] = patient;
			System.out.println("Patient Registered: " + patient.get_Name());
			count++;
		} else {
			System.out.println("No more patients can be registered.");
		}
	}

	public void show_Patient_Details() {
		System.out.println("\nPatient Details : ");
		for (int i = 0; i < count; i++) {
			Patient_Reg p = patients[i];
			System.out.println("ID: " + p.get_Id() + ", Name: " + p.get_Name() + ", Age: " + p.get_Age() + ", Illness: "
					+ p.get_Illness());
		}
	}

	public Patient_Reg[] get_Patients() {
		return patients;
	}

	public int get_Count() {
		return count;
	}
}
