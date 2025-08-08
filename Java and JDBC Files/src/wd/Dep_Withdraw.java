package wd;

import java.util.Scanner;

class Bank_Account {
	double balance;

	void Depo(double amount) {
		balance += amount;
		System.out.println("Deposit Amount : " + amount);
	}

	void Withd(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal Amount : " + amount);
		} else {
			System.out.println("\n Insufficient Balance!!");
		}
	}

	void Display_Bal() {
		System.out.println("Your Current Balance is " + balance);

	}
}

public class Dep_Withdraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank_Account ba = new Bank_Account();
		System.out.print("Enter Initial balance : ");
		ba.balance = sc.nextDouble();
		System.out.print("Enter deposit amount: ");
		ba.Depo(sc.nextDouble());
		System.out.print("Enter withdraw amount: ");
		ba.Withd(sc.nextDouble());

		ba.Display_Bal();
		sc.close();
	}

}
