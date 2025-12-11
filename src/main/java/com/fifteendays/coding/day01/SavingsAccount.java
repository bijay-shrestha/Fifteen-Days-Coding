package com.fifteendays.coding.day01;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += balance * interestRate;
    }
}
