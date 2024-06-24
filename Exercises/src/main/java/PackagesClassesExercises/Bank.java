package PackagesClassesExercises;

class BankAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
}

public class Bank {
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
