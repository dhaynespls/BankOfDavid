package com.bankofdavid.accounts;


import java.util.UUID;

public class Checking extends Account {

    public Checking() {
        super();
    }

    public Checking(int startingBalance, String accountName) {
        super(startingBalance, accountName);
    }

    @Override
    void getLastUUID() {

    }

    @Override
    void getSpecificTransaction() {

    }

    @Override
    void deposit(int amountToDeposit) {

    }

    public void withdraw() {

    }

    public boolean checkWorkingJunit() {
        return true;
    }
}
