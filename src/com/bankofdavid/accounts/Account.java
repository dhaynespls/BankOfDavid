/**
 * The Account abstract class describes common functionality of a BankOfDavid account as well as any high level
 * functions that are utilized in all accounts.
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
package com.bankofdavid.accounts;

import com.bankofdavid.stores.CashStore;

import java.util.UUID;

public abstract class Account {

    // Name of the Account
    private String accountName;

    // Associated CashStore for this Account
    private CashStore myCashStore;

    /**
     * Generate a new account with default values.
     */
    public Account () {
        super();
        this.accountName = "";
        this.myCashStore = new CashStore(0);
    }

    /**
     * Generating a new account with non-default values.
     * @param startingBalance How much money to insert initially into the account.
     * @param accountName The name of the account holder.
     */
    public Account (int startingBalance, String accountName) {
        super();
        this.accountName = accountName;

        // Initialize a new CashStore object to store the money and transaction history.
        this.myCashStore = new CashStore(startingBalance);
    }

    /**
     * Add money to an account's CashStore.
     * @param amountToDeposit The amount of money to place into the store.
     */
    public abstract void deposit(int amountToDeposit);

    /**
     * Return the last UUID used to store a transaction into the CashStore.
     */
    public abstract UUID getLastUUID();

    /**
     * Return transaction details for a given UUID.
     * @param specificTransactionUUID The UUID to use when querying for the specific transaction.
     */
    public abstract void getSpecificTransaction(UUID specificTransactionUUID);

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
