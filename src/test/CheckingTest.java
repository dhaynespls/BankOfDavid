package test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.bankofdavid.accounts.Checking;

public class CheckingTest {

    @Test
    public void deposit() {
    }

    @Test
    public void testCheckWorkingJunit () {
        Checking myChecking = new Checking();
        assertTrue(myChecking.checkWorkingJunit());
    }
}