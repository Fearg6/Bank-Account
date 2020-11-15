package com.mcmorrow.bank.app;

public abstract class Account implements IBaseRate {
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;


    public Account(String name, String sSN, int initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance= initDeposit;

        index++;
        this.accountNumber = setAccountNumber();


    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int randomNumber = (int) (Math.random()*Math.pow(10,3));
        int uniqueID = index;
        return lastTwoOfSSN+uniqueID+randomNumber;
    }

    public void showInfo(){
        System.out.println(
                "Name: "+name+
                        " Account Number: "+accountNumber+
                        " Balance: "+balance);
    }

}
