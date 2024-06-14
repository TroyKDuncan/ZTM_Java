package main;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountHolder("Troy");
        myAccount.setAccountNumber(123456);
        myAccount.setBalance(4500);


    }
}
