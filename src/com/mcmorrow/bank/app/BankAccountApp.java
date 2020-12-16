package com.mcmorrow.bank.app;

public class BankAccountApp {

    public static void main(String[] args) {
        Checking check1 = new Checking("Tommy Wilson","1204857343",1500);
        Savings sav1 = new Savings("Richey Love","14523575432",2500);


        sav1.compound();

        check1.showInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sav1.showInfo();



    }
}
