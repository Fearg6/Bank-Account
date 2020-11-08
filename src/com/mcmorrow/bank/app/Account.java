package com.mcmorrow.bank.app;

public abstract class Account implements IBaseRate {

    public Account(String name){
        System.out.println("Name is: "+ name);
        System.out.print("New Account: ");
    }

}
