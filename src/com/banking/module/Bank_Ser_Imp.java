package com.banking.module;

public class Bank_Ser_Imp implements Bank_Ser {
    private Customer_Reg[] customers;
    private int count = 0; //registration counting

    public Bank_Ser_Imp(int capacity) {
        customers = new Customer_Reg[capacity];
    }

    @Override
    public void add_Customer(Customer_Reg customer) {
        if (count < customers.length) {
            customers[count++] = customer;
            System.out.println("Customer added: " + customer.get_Name());
        } else {
            System.out.println("Customer limit reached.");
        }
    }

    @Override
    public void show_Customers() {
        System.out.println("\nCustomer Details :- \n");
        for (int i = 0; i < count; i++) {
            Customer_Reg c = customers[i];
            System.out.println(c.get_Id() + " | " + c.get_Name() + " | Rs. " + c.get_Balance());
        }
    }

    @Override
    public void deposit(int customerId, double amount) {
        for (int i = 0; i < count; i++) {
            if (customers[i].get_Id() == customerId) {
                customers[i].set_Balance(customers[i].get_Balance() + amount);
                System.out.println("\nDeposited ₹" + amount + " to " + customers[i].get_Name());
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    @Override
    public void withdraw(int customerId, double amount) {
        for (int i = 0; i < count; i++) {
            if (customers[i].get_Id() == customerId) {
                if (customers[i].get_Balance() >= amount) {
                    customers[i].set_Balance(customers[i].get_Balance() - amount);
                    System.out.println("\nWithdrawn Rs. " + amount + " from " + customers[i].get_Name());
                } else {
                    System.out.println("Insufficient balance for " + customers[i].get_Name());
                }
                return;
            }
        }
        System.out.println("Customer not found.");
    }
}
