package test;

import org.junit.Test;

import static org.junit.Assert.*;
import com.bankofdavid.transfers.SlowTransfer;

public class SlowTransferTest {

    @Test
    public void transfer() {
        SlowTransfer mySlowTransfer = new SlowTransfer();

        mySlowTransfer.transfer();

        assertTrue(true);
    }
}