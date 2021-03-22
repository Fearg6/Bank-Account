package com.mcmorrow.bank.app;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        String file = "C:\\Users\\fearg\\Dropbox\\Projects\\Java\\Bank-Account\\src\\utilities\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSn,initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSn,initDeposit));
            }else {
                System.out.println("Error Reading Account Type");
            }
        }


        for (Account acc: accounts) {
            System.out.println("**************");
            acc.showInfo();
        }

        
    }
}
