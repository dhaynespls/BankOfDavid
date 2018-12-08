package com.bankofdavid.accounts;

public class Credit extends Account{

    public Credit() {
        super();
    }

    @Override
    void getLastUUID() {

    }

    @Override
    void getSpecificTransaction() {

    }

    @Override
    void deposit(int amountToDeposit) {
        if(amountToDeposit < 1) {
            throw new java.lang.RuntimeException("this is not quite as bad");
        }
    }
}
