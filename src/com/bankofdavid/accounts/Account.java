package com.bankofdavid.accounts;

public abstract class Account {
    private int accountStartingBalance;
    private String accountName;

    public Account () {
        super();
        this.accountStartingBalance = 0;
        this.accountName = "";
    }

    public Account (int startingBalance, String accountName) {
        super();
        this.accountStartingBalance = startingBalance;
        this.accountName = accountName;
    }

    abstract void deposit();


    public int getAccountStartingBalance() {
        return accountStartingBalance;
    }

    public String getAccountName() {
        return accountName;
    }


    public void setAccountStartingBalance(int accountStartingBalance) {
        this.accountStartingBalance = accountStartingBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
