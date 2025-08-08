package wd;

import java.util.Scanner;

abstract class Payment {
	double amount;

	abstract void pay();

	void paymentInfo() {
		System.out.println("Processing the payment of Rs." + amount);
	}
}

class Credit_Card_Payment extends Payment {
	void pay() {
		System.out.println("Paid Rs." + amount + " using Credit Card.");
	}
}

class UPI_Payment extends Payment {
	void pay() {
		System.out.println("Payment of Rs." + amount + " done using UPI.");
	}
}

public class Abs_Payment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount for Credit Card Payment: ");
		Payment pay1 = new Credit_Card_Payment();
		pay1.amount = sc.nextDouble();
		pay1.paymentInfo();
		pay1.pay();

		System.out.println();

		System.out.print("Enter amount for UPI Payment: ");
		Payment pay2 = new UPI_Payment();
		pay2.amount = sc.nextDouble();
		pay2.paymentInfo();
		pay2.pay();

		sc.close();
	}
}
