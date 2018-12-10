package test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.bankofdavid.accounts.Checking;

public class CheckingTest {

    @Test
    public void deposit() {
        Checking myChecking = new Checking(100, "David Haynes");

        myChecking.deposit(100);

        assertEquals(200, myChecking.getCurrentBalance());
    }

    @Test
    public void withdraw() {
        Checking myChecking = new Checking(100, "David Haynes");
        myChecking.withdraw(100);

        assertEquals(0, myChecking.getCurrentBalance());
    }
}