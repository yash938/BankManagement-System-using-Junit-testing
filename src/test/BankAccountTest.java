package test;

import Entity.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1, "John Doe");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(1, "John Doe");
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testInvalidWithdraw() {
        BankAccount account = new BankAccount(1, "John Doe");
        account.deposit(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
        assertEquals("Insufficient balance.", exception.getMessage());
    }

    @Test
    void testTransactionHistory() {
        BankAccount account = new BankAccount(1, "John Doe");
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(2, account.getTransactionHistory().size());
    }
}
