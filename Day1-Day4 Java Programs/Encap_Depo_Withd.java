package wd;

class Bank_Acc {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal! Check amount or balance.");
        }
    }
}

public class Encap_Depo_Withd {
    public static void main(String[] args) {
        Bank_Acc ba = new Bank_Acc();

        ba.setBalance(5000);      
        ba.deposit(2000);        
        ba.withdraw(1000);        

        System.out.println("Final Balance: " + ba.getBalance());
    }
}
