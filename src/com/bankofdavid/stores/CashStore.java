/**
 * The CashStore acts as the source of truth for the history of transactions for a given account name as well as the
 * running account balance.
 *
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
package com.bankofdavid.stores;

import java.text.SimpleDateFormat;
import java.util.*;

public class CashStore {

    // The current amount of money in the account balance.
    private int currentBalance;

    private UUID lastUsedUUID;

    /*
        The main storage unit that manages account transaction data.

        {
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
            ],
        }

     */
    private List<Map<String, String>> theCashStore;

    public CashStore() {
        super();
        this.currentBalance = 0;
        theCashStore = new ArrayList<>();
    }

    public CashStore (int startingBalance) {
        super();
        this.currentBalance = startingBalance;
    }

    /**
     * Shortcut method to get the string value of the current datetime.
     * @return Tne current datetime.
     */
    private static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    public void updateStore(int cashValue) {
        String prevBalance = Integer.toString(currentBalance);
        String newBalance = Integer.toString((currentBalance + cashValue));
        String dateTime = now();

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        Map<String, String> transactionEntry = new HashMap<>();

        transactionEntry.put("prevBalance", prevBalance);
        transactionEntry.put("newBalance", newBalance);
        transactionEntry.put("dateTime", dateTime);
        transactionEntry.put("UUID", randomUUIDString);

        this.theCashStore.add(transactionEntry);
    }

    private void getFromStore(UUID transactionUUID) {

    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public UUID getLastUsedUUID() {
        return lastUsedUUID;
    }
}
