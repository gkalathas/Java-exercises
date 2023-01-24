package org.example.domain;

import org.example.exception.CustomException;
import org.example.repository.BaseRate;
import org.example.repository.Transaction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Account implements BaseRate {
    private Integer accountId = 10000;
    private String accountNumber;
    private String ssn;
    private Customer accountCreator;
    private LocalDate creationDate;
    private final List<Customer> accountHolders = new ArrayList<Customer>(2);
    private double accountBalance;
    private List<Transaction> transactionHistory = new ArrayList<>();

    private double rate;


    public Account() {
    }


    public Account(Customer accountCreator) {
        this.accountId ++;
        this.accountCreator = accountCreator;
        this.creationDate = LocalDate.now();
        this.accountHolders.add(accountCreator);
        this.accountNumber = setAccountNumber();
        this.rate = getBaseRate();
    }

    public double getRate() {
        return rate;
    }
    private String setAccountNumber() {
        String lastTwoSSN = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = accountId;
        int randomNumber =(int) (Math.random()* Math.pow(10, 3));
        return lastTwoSSN + uniqueID;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Customer> getAccountHolders() {
        return accountHolders;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionList) {
        this.transactionHistory = transactionList;
    }

    public Customer getAccountCreator() {
        return accountCreator;
    }

    public void setAccountCreator(Customer accountCreator) {
        this.accountCreator = accountCreator;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Double.compare(account.getAccountBalance(),
                getAccountBalance()) == 0
                && getAccountId().equals(account.getAccountId())
                && getAccountCreator().equals(account.getAccountCreator())
                && getCreationDate().equals(account.getCreationDate())
                && getAccountHolders().equals(account.getAccountHolders())
                && getTransactionHistory().equals(account.getTransactionHistory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountId(),
                getAccountCreator(),
                getCreationDate(), getAccountHolders(),
                getAccountBalance(), getTransactionHistory());
    }

    @Override
    public String toString() {
        return "Account: " +
                "\naccountId: " + accountId +
                "\ncreationDate: " + creationDate +
                "\naccountHolders: " + accountHolders +
                "\naccountBalance: " + accountBalance +
                "\ntransactionList: " + transactionHistory;
    }

    public void addAccountHolders(Customer customer) {
        if(accountHolders.size() > 2) {
            System.out.println("No more customers can have the same account");
        } else {
            accountHolders.add(customer);
        }
    }


    public void deposit(double amount) {
        accountBalance += amount;
        transactionHistory.add(new Transaction(LocalDate.now(), "Deposit", amount));
        System.out.println("Depositing $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            throw new CustomException("You are poor");
        }
        accountBalance -= amount;
        transactionHistory.add(new Transaction(LocalDate.now(), "Withdraw", amount));
        System.out.println("Withdrawing successful!! New balance: " + accountBalance);
    }

    public void PrintBalance() {
        System.out.println("Your balance now: $" + accountBalance);
    }


}

