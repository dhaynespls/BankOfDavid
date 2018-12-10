package test;

import org.junit.Before;
import org.junit.Test;

import com.bankofdavid.stores.CashStore;

import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class CashStoreTest {

    @Test
    public void getFromStore() {
        CashStore myCashStore = new CashStore(100);

        UUID lastUUID = myCashStore.getLastUsedUUID();

        Map<String, String> lastTransaction = myCashStore.getFromStore(lastUUID);

        assertNotNull(lastTransaction);
    }

    @Test
    public void updateStore() {
        CashStore myCashStore = new CashStore(100);

        myCashStore.updateStore(100);

        assertEquals(200, myCashStore.getCurrentBalance());
    }

    @Test
    public void getCurrentBalance() {
        CashStore myCashStore = new CashStore(100);

        assertEquals(100, myCashStore.getCurrentBalance());
    }

    @Test
    public void getLastUsedUUID() {
        CashStore myCashStore = new CashStore();
        UUID lastUUID = myCashStore.getLastUsedUUID();
        assertNotNull(lastUUID);
    }
}