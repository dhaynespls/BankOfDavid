package com.bankofdavid.accounts;

import com.bankofdavid.stores.CashStore;

import java.util.UUID;

/**
 * Words describing the Account class.
 */
public abstract class Account {

    // Name of the Account
    private String accountName;

    // Associated CashStore for this Account
    private CashStore myCashStore;

    public Account () {
        super();
        this.accountName = "";
        this.myCashStore = new CashStore(0);
    }

    /**
     * Words about the Account constructor.
     * @param startingBalance the first argument
     * @param accountName the second argument
     */
    public Account (int startingBalance, String accountName) {
        super();
        this.accountName = accountName;
        this.myCashStore = new CashStore(startingBalance);
    }

    abstract void deposit(int amountToDeposit);

    abstract void getLastUUID();

    abstract void getSpecificTransaction();
}
