/**
 * A Credit Account may only add money to the CashStore (taking on debt).
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
package com.bankofdavid.accounts;

import java.util.UUID;

public class Credit extends Account{

    public Credit() {
        super();
    }

    public Credit(int startingBalance, String accountName) {
        super(startingBalance, accountName);

        if(! isValuePositive(startingBalance)) {
            throwNegativeError();
        }
    }

    private void throwNegativeError() {
        throw new java.lang.RuntimeException("You charge a negative number.");
    }

    private boolean isValuePositive(int value) {
        return value > 0;
    }

    @Override
    public void deposit(int amountToDeposit) {
        if(! isValuePositive(amountToDeposit)) {
            throwNegativeError();
        }
    }

    @Override
    public void getSpecificTransaction(UUID specificTransactionUUID) {

    }
}
