import Entity.BankAccount;
import Service.BankService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1,"yash sharma");
        BankService service = new BankService();

        // Deposit
        service.performDeposit(account, 5000);
        service.performDeposit(account, 2000);

        // Withdrawal
        service.performWithdrawal(account, 3000);

        // Check Balance
        System.out.println("Balance: " + service.checkBalance(account));

        // Transaction History
        service.displayTransactionHistory(account);


    }
}