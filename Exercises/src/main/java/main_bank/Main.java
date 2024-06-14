package main_bank;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.accountHolder = "Troy";
        myAccount.accountNumber = 123456;
        myAccount.balance = 4500;

        System.out.println("Account number: " + myAccount.accountNumber);
        System.out.println("Account holder: " + myAccount.accountHolder);
        System.out.println("Account balance: " + myAccount.balance);
    }
}
