package com.mcmorrow.bank.app;

public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;


    public Savings(String name, String sSN, int initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        System.out.println("Account Number: "+this.accountNumber);
        System.out.print("New Savings Account: ");
    }
}
