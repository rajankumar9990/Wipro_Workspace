package com.day6;

import java.util.Scanner;

class InvalidPinException extends Exception {
	public InvalidPinException(String message) {
		super(message);
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class ATM_Machine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int correctPin = 1234; // Stored PIN
		double balance = 20000.0; // Initial Balance
		int attempts = 0;
		boolean loggedIn = false;

		try {
			System.out.println("Welcome to the ATM");

			while (attempts < 3) {
				System.out.print("Enter your 4-digit PIN: ");
				int enteredPin = sc.nextInt();

				if (enteredPin == correctPin) {
					loggedIn = true;
					break;
				} else {
					attempts++;
					if (attempts == 3) {
						throw new InvalidPinException("Card blocked after 3 wrong attempts!");
					} else {
						System.out.println("Wrong PIN! Attempts left: " + (3 - attempts));
					}
				}
			}

			if (loggedIn) {
				boolean exit = false;
				while (!exit) {
					System.out.println("\n===== ATM MENU =====");
					System.out.println("1. Check Balance");
					System.out.println("2. Deposit");
					System.out.println("3. Withdraw");
					System.out.println("4. Exit");
					System.out.print("Choose option: ");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Your balance: " + balance);
						break;

					case 2:
						System.out.print("Enter deposit amount: ");
						double deposit = sc.nextDouble();
						balance += deposit;
						System.out.println("Deposited! New balance: " + balance);
						break;

					case 3:
						System.out.print("Enter withdraw amount: ");
						double withdraw = sc.nextDouble();
						try {
							if (withdraw > balance) {
								throw new InsufficientBalanceException(
										"Insufficient balance! Your balance is: " + balance);
							}
							balance -= withdraw;
							System.out.println("Withdrawn! New balance: " + balance);
						} catch (InsufficientBalanceException e) {
							System.out.println("Wrong!! " + e.getMessage());
						}
						break;

					case 4:
						System.out.println("Thank you for using the ATM.");
						exit = true;
						break;

					default:
						System.out.println("Invalid option!");
					}
				}
			}

		} catch (InvalidPinException e) {
			System.out.println("Wrong!! " + e.getMessage());
		} finally {
			System.out.println("Transaction ended. Please remove your card.");
			sc.close();
		}
	}
}
