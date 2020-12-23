package Transactions;

public class DTO_Transactions {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double dep) {
        balance += dep;
    }

    public void withdraw(double wit) {
        balance -= wit;
    }
}
