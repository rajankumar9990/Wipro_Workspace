package com.banking.module;

public class Customer_Reg {
	private int id;
	private String name;
	private double balance;

	public Customer_Reg(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int get_Id() {
		return id;
	}

	public String get_Name() {
		return name;
	}

	public double get_Balance() {
		return balance;
	}

	public void set_Balance(double balance) {
		this.balance = balance;
	}

}
