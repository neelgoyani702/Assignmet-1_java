/*
    Design a class named Account that contains:
    • A private int data field named id for the account (default 0).
    • A private double data field named balance for the account (default 500₹).
    • A private double data field named annualInterestRate that stores the current
    interest rate (default 7%). Assume all accounts have the same interest rate.
    • A private Date data field named dateCreated that stores the date when the
    account was created.
    • A no-arg constructor that creates a default account.
    • A constructor that creates an account with the specified id and initial balance.
    • The accessor and mutator methods for id, balance, and annualInterestRate.
    • The accessor method for dateCreated.
    • A method named getMonthlyInterestRate() that returns the monthly interest rate.
    • A method named getMonthlyInterest() that returns the monthly interest.
    • A method named withdraw that withdraws a specified amount from the account.
    • A method named deposit that deposits a specified amount to the account.
*/

import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

class Pr_2 {
    public static void main(String[] args) {
        // Account a = new Account(2, 500);
        // Account.setAnnualInterestRate(5);
        Account a = new Account();
        a.setId(25);
        a.setBalance(1000);
        Account.setAnnualInterestRate(5);
        a.withdraw(250);
        a.deposit(300);
        a.getAccountdetailes();
    }

}


