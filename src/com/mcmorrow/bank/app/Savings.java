package com.mcmorrow.bank.app;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
        printBalance();
    }

    private void setSafetyDepositBox() {
        while (safetyDepositBoxID<=100) {
            safetyDepositBoxID = (int) (Math.random()*Math.pow(10,3));
        }
        while (safetyDepositBoxKey<=1000) {
            safetyDepositBoxKey =  (int) (Math.random()*Math.pow(10,4));
        }
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Savings Accounts Features" +
                        "\nSafety Deposit Box ID: "+ safetyDepositBoxID+
                        "\nSafety Deposit Box Key: "+safetyDepositBoxKey

        );
    }
}
