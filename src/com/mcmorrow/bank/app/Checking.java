package com.mcmorrow.bank.app;

public class Checking extends Account {
    long debitCardNumber;
    int debitCardPIN;


    public Checking(String name, String sSN, int initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        while (debitCardNumber<100000000000L) {
            debitCardNumber = (long) (Math.random()*Math.pow(10,12));
        }
        while (debitCardPIN<1000) {
            debitCardPIN = (int) (Math.random()*Math.pow(10,4));
        }

    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Checking Account Features" +
                "\n Debit Card Number: "+debitCardNumber+
                "\n Debit Card PIN: "+debitCardPIN
        );
    }
}
