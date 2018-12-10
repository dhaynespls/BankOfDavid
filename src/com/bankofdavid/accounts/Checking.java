/**
 * A Checking Account may add or remove money from the CashStore.
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
package com.bankofdavid.accounts;

import java.util.UUID;

public class Checking extends Account {

    /**
     * Generate a new Checking account with default values.
     */
    public Checking() {
        super();
    }

    /**
     * Generate a new Checking account with user provided values.
     * @param startingBalance How much money to insert initially into the account.
     * @param accountName The name of the account holder.
     */
    public Checking(int startingBalance, String accountName) {
        super(startingBalance, accountName);
    }

    /**
     * Add money to an Checking account's CashStore.
     * @param amountToDeposit The amount of money to place into the store.
     */
    @Override
    public void deposit(int amountToDeposit) {

    }

    /**
     * Return transaction details for a given UUID.
     * @param specificTransactionUUID The UUID to use when querying for the specific transaction.
     */
    @Override
    public void getSpecificTransaction(UUID specificTransactionUUID) {

    }

    /**
     * Remove money from a Checking account's CashStore.
     * @param amountToWithdraw
     */
    public void withdraw(int amountToWithdraw) {

    }
}
