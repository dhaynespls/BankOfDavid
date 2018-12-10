package com.bankofdavid.stores;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * The CashStore acts as the source of truth for the history of transactions for a given account name as well as the
 * running account balance.
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
public class CashStore {

    // The current amount of money in the account balance.
    private int currentBalance;
    // Temporary storage for the last used UUID.
    private UUID lastUsedUUID;

    /*
        The main storage unit that stores account transaction data.

        [
            {
                prevBalance: string
                newBalance:  string
                dateTime: string
                uuid: string
            },

            {
                prevBalance
                newBalance
                dateTime
                uuid
            }
        ]

     */
    private List<Map<String, String>> theCashStore;

    /**
     * Generate a new account with default values.
     */
    public CashStore() {
        super();
        this.currentBalance = 0;
        theCashStore = new ArrayList<>();
        this.updateStore(0);
    }

    /**
     * Generate a new CashStore with a non-default
     * @param startingBalance
     */
    public CashStore (int startingBalance) {
        super();
        theCashStore = new ArrayList<>();
        this.updateStore(startingBalance);
    }

    /**
     * Shortcut method to get the string value of the current datetime.
     * @return The current datetime.
     */
    private static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    /**
     * Update the current state of the CashStore by inserting a transaction entry into the Store as well as updating
     * class attributes.
     * @param cashValue The value of cash that is used in updating the Store.
     */
    public void updateStore(int cashValue) {
        String prevBalance = Integer.toString(currentBalance);
        String newBalance = Integer.toString((currentBalance + cashValue));
        String dateTime = now();

        UUID uuid = UUID.randomUUID();

        Map<String, String> transactionEntry = new HashMap<>();
        transactionEntry.put("prevBalance", prevBalance);
        transactionEntry.put("newBalance", newBalance);
        transactionEntry.put("dateTime", dateTime);
        transactionEntry.put("UUID", uuid.toString());

        this.theCashStore.add(transactionEntry);
        this.currentBalance = currentBalance + cashValue;
        this.lastUsedUUID = uuid;
    }

    /**
     * Given a UUID, search the CashStore for the associated transaction.
     * @param transactionUUID The UUID to search for.
     * @return The associated transaction.
     */
    public Map<String, String> getFromStore(UUID transactionUUID) {
        for (Map<String, String> transaction : this.theCashStore) {
            if(transaction.get("UUID").equals(transactionUUID.toString())) {
                return transaction;
            }
        }

        throw new java.lang.RuntimeException("Transaction not found!");
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public UUID getLastUsedUUID() {
        return lastUsedUUID;
    }
}
