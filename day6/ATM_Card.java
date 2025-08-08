package com.day6;

import java.util.Scanner;

class InvalidPinException extends Exception {
	public InvalidPinException(String message) {
		super(message);
	}
}

public class ATM_Card {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPin = 1234; // pin

		try {
			System.out.println("ATM Card is inserted.");
			System.out.print("Enter 4-digit PIN: ");
			int enteredPin = sc.nextInt();

			if (enteredPin == correctPin) {
				System.out.println("PIN correct. Access granted.");
				System.out.println("You can proceed with withdrawal or other options.");
			} else {

				throw new InvalidPinException("Wrong PIN! Transaction declined.");
			}
		} catch (InvalidPinException e) {
			System.out.println("Access denied: " + e.getMessage());
		} finally {
			System.out.println("Transaction ended. Please remove your card.");
			sc.close();
		}
	}
}
