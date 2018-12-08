package test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import com.bankofdavid.accounts.Checking;

public class CheckingTest {

    @Test
    public void testRandomShit () {
        Checking myChecking = new Checking(100, "David's Checking Account");
        assertTrue(myChecking.checkWorkingJunit());
    }
}