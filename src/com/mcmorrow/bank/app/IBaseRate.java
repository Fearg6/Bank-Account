package com.mcmorrow.bank.app;

public interface IBaseRate {

    default double getBaseRate(){
        return 2.5;
    }
}
