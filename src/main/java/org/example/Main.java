package org.example;

import org.example.compte.BankAccount;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        BankAccount compte1 = new BankAccount(1_123_123_123,  "karim megri");

        compte1.deposit(150);

        compte1.withdrawMoney(50);

       compte1.DisplayAccount();

        System.out.println(compte1);
    }
}