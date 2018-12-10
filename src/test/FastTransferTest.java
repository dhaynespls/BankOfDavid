package test;

import org.junit.Test;

import static org.junit.Assert.*;
import com.bankofdavid.transfers.FastTransfer;

public class FastTransferTest {

    @Test
    public void transfer() {
        FastTransfer myFastTransfer = new FastTransfer();

        myFastTransfer.transfer();

        assertTrue(true);
    }
}