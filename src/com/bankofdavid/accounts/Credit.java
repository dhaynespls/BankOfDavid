package com.bankofdavid.accounts;

/**
 * A Credit Account may only add money to the CashStore (taking on debt).
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
public class Credit extends Account{

    /**
     * Generate a new Credit account with default values.
     */
    public Credit() {
        super();
    }

    /**
     * Generate a new Credit account with non-default values.
     * @param startingBalance How much debt to insert initially into the account.
     * @param accountName The name of the account holder.
     */
    public Credit(int startingBalance, String accountName) {
        super(startingBalance, accountName);

        if(! isValuePositive(startingBalance)) {
            throwNegativeError();
        }
    }

    /**
     * Reusable function to throw a negative number error.
     * @throws RuntimeException
     */
    private void throwNegativeError() throws RuntimeException {
        throw new java.lang.RuntimeException("You charge a negative number.");
    }

    /**
     * Silly method to check if a number is negative.
     * @param value The number to check.
     * @return Boolean if the number is negative.
     */
    private boolean isValuePositive(int value) {
        return value > 0;
    }

    /**
     * Add debt to a account's CashStore. Debt can only be accumulated instead of removed.
     * @param amountToDeposit The amount of money to place into the store.
     */
    @Override
    public void deposit(int amountToDeposit) {
        if(! isValuePositive(amountToDeposit)) {
            throwNegativeError();
        }
        this.updateStore(amountToDeposit);
    }
}
