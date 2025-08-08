package com.banking.module;

public interface Bank_Ser {
	void add_Customer(Customer_Reg customer);

	void show_Customers();

	void deposit(int customer_Id, double amount);

	void withdraw(int customer_Id, double amount);
}
