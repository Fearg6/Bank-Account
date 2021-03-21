package com.mcmorrow.bank.app;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "C:\\Users\\fearg\\Dropbox\\Projects\\Java\\Bank-Account\\src\\utilities\\NewBankAccounts.csv";


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
//            System.out.println("New Account:");
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            System.out.println(name+" "+sSn+" "+accountType+" €"+initDeposit);
            if(accountType.equals("Savings")){
                System.out.println("Open a Savings Account");
            }else if(accountType.equals("Checking")){
                System.out.println("Open a Checking Account");
            }else {
                System.out.println("Error Reading Account Type");
            }
        }
    }
}
