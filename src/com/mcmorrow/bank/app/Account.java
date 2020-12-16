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

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        int randomNumber = (int) (Math.random()*Math.pow(10,3));
        int uniqueID = index;
        return lastTwoOfSSN+uniqueID+randomNumber;
    }

    public void compound(){
        double accruedInterest = balance - (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: €"+accruedInterest);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing €"+amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing €"+amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transfering €"+amount+" to: "+toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("YOUR BALANCE IS €"+balance);
    }

    public void showInfo(){
        System.out.println(
                "***********"+
                        "\nName: "+name+
                        "\nAccount Number: "+accountNumber+
                        "\nBalance: "+balance+
                        "\nRate: "+rate+"%");
    }

}
