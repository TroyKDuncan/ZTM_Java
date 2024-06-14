package bank;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setAccountHolder(String newAccountHolder) {
        this.accountHolder = newAccountHolder;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
