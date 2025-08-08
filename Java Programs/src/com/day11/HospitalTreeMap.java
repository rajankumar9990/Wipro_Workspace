package com.day11;

import java.util.*;

public class HospitalTreeMap {
	public static void main(String[] args) {

		TreeMap<Integer, String> patientMap = new TreeMap<>();

		patientMap.put(102, "Renu");
		patientMap.put(101, "Radhya");
		patientMap.put(104, "Sai");
		patientMap.put(103, "Mahasa");
		patientMap.put(105, "Ganu");
		System.out.println("\nAscending Patient List:");
		for (Map.Entry<Integer, String> entry : patientMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		System.out.println("Patient with ID 101: " + patientMap.get(101));

		patientMap.remove(101);
		System.out.println("Removed Patient ID 101");

		System.out.println("\nHas ID 102? " + patientMap.containsKey(102));

		System.out.println("\nDescending Patient List:");
		NavigableMap<Integer, String> desMap = patientMap.descendingMap();
		for (Map.Entry<Integer, String> entry : desMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		System.out.println(
				"\nFirst Patient ID: " + patientMap.firstKey() + ", Name: " + patientMap.get(patientMap.firstKey()));

		System.out.println(
				"Last Patient ID: " + patientMap.lastKey() + ", Name: " + patientMap.get(patientMap.lastKey()));
	}
}
