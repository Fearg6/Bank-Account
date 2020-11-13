package com.mcmorrow.bank.app;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;


    public Checking(String name, String sSN, int initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("New Checking Account: ");

    }
}
