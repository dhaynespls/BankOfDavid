package com.bankofdavid.accounts;

import com.bankofdavid.stores.CashStore;

/**
 * Words describing the Account class.
 */
public abstract class Account {

    // Starting balance to insert into the CashStore
    private int accountStartingBalance;
    // Name of the Account
    private String accountName;
    // Associated CashStore for this Account
    private CashStore myCashStore;

    public Account () {
        super();
        this.accountStartingBalance = 0;
        this.accountName = "";
        this.myCashStore = new CashStore();
    }

    /**
     * Words about the Account constructor.
     * @param startingBalance the first argument
     * @param accountName the second argument
     */
    public Account (int startingBalance, String accountName) {
        super();
        this.accountStartingBalance = startingBalance;
        this.accountName = accountName;
        this.myCashStore = new CashStore();
    }

    /**
     * Words about the deposit abstract function.
     */
    abstract void deposit();

    /**
     * Words about the withdrawl abstract function.
     */
    abstract void withdrawl();

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
