package test;

import com.bankofdavid.accounts.Credit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CreditTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void deposit() {
        Credit myCredit = new Credit(100, "David Haynes");

        myCredit.deposit(100);

        assertEquals(200, myCredit.getCurrentBalance());
    }

    @Test
    public void checkNegativeConstructor() {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("You cannot charge a negative number.");
        // This throws a negative number exception
        Credit myCredit = new Credit(-100, "David Haynes");
    }

    @Test
    public void checkNegativeDeposit() {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("You cannot charge a negative number.");
        Credit myCredit = new Credit(100, "David Haynes");

        // This throws a negative number exception
        myCredit.deposit(-100);
    }

}