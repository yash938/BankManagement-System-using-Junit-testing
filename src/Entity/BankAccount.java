package Entity;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;

    private double balance;

    private List<String> transactionHistory;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.transactionHistory=new ArrayList<>();
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", transactionHistory=" + transactionHistory +
                '}';
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance.");
        balance -= amount;
        transactionHistory.add("Withdrew: " + amount);
    }
}
