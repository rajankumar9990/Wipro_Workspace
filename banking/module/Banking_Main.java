package com.banking.module;

public class Banking_Main {
    public static void main(String[] args) {
        Bank_Ser bank = new Bank_Ser_Imp(3);

        bank.add_Customer(new Customer_Reg(101, "Anil", 10000));
        bank.add_Customer(new Customer_Reg(102, "Aryan", 20000));

        bank.show_Customers();

        bank.deposit(101, 2000);
        bank.withdraw(102, 5000);

        bank.show_Customers();
    }
}
