package org.vir;

public class Account {
    private double balance;

    public Account(double balance) {//constructor => INIT
        this.balance = balance;
    }

    public Account() { //A esto se llama sobrecarga de metodo
    this.balance = 0;
    }

    public double getBalance() {
    return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
