package com.mcmorrow.bank.app;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "C:\\Users\\fearg\\OneDrive\\Projects\\Java\\Bank-Account\\src\\utilities\\NewBankAccounts.csv";


//        Checking check1 = new Checking("Tommy Wilson","1204857343",1500);
//        Savings sav1 = new Savings("Richey Love","14523575432",2500);
//
//
//        sav1.compound();
//
//        check1.showInfo();
//        System.out.println("******************");
//        sav1.showInfo();


        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            System.out.println("New Account:");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }
    }
}
