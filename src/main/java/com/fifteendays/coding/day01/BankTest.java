package com.fifteendays.coding.day01;

public class BankTest {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new Account(1000);
        accounts[1] = new SavingsAccount(2000, 0.05);

        accounts[0].deposit(100);
        ((SavingsAccount) accounts[1]).addInterest();
        System.out.println(accounts[0].getBalance()); // Output: 1100.0
        System.out.println(accounts[1].getBalance()); // Output: 2100

    }
}
