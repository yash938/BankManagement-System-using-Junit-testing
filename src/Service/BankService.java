package Service;

import Entity.BankAccount;

public class BankService {
    public double checkBalance(BankAccount account){
        return account.getBalance();
    }

    public void performDeposit(BankAccount account,double amount){
        account.deposit(amount);
    }

    public void performWithdrawal(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public void displayTransactionHistory(BankAccount account) {
        System.out.println("Transaction History for Account: " + account.getAccountNumber());
        for (String transaction : account.getTransactionHistory()) {
            System.out.println(transaction);
        }
    }
}
