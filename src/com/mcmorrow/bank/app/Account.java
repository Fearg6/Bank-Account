package com.mcmorrow.bank.app;

public abstract class Account implements IBaseRate {
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;


    public Account(String name, String sSN, int initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance= initDeposit;
        System.out.println("Name: "+name+" SSN: "+ sSN+" Balance: "+balance);
    }

}
