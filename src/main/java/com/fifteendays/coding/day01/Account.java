package com.fifteendays.coding.day01;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
