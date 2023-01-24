package org.example.domain;

import org.example.exception.CustomException;
import org.example.repository.Check;
import org.example.repository.Transaction;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers;
    private final List<Account> accounts;
    private final List<Check> checks;

    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
        checks = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Check> getChecks() {
        return checks;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addCheck(Check check) {
        checks.add(check);
    }

    public void deposit(Integer accountNumber, double amount) {
        Account account = findById(accountNumber, this.accounts);
        account.deposit(amount);
        System.out.println("New balance: " + account.getAccountBalance());
    }

    public void withdraw(Integer accountNumber, double amount) {
        Account account = findById(accountNumber, this.accounts);
        account.withdraw(amount);
        System.out.println("New balance: " + account.getAccountBalance());
    }

    public void transfer(Integer fromAccountNumber, Integer toAccountNumber, double amount) {
        Account fromAccount = findById(fromAccountNumber, this.accounts);
        Account toAccount = findById(toAccountNumber, this.accounts);
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Ammount transfered successfully to account with name: " + toAccount.getAccountCreator());
    }

    public void draftCheck(Integer accountNumber, double amount, String memo) {
        Account account = findById(accountNumber, this.accounts);
        if (account.getAccountBalance() < amount) {
            throw new CustomException("You are really poor");
        }
        account.withdraw(amount);
        int checkNumber = checks.size() + 1;
        String holder = account.getAccountHolders().get(0).getFirstName();
        Check check = new Check(checkNumber, holder, amount, memo);
        checks.add(check);
    }


    public void printCustomersReport() {
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getFirstName());
            System.out.println("Tax Registry Number: " + customer.getVAT_NUMBER());
            System.out.print("Accounts: ");
            for (Account account : accounts) {
                for (Customer holder : account.getAccountHolders()) {
                    if (holder.getVAT_NUMBER().equals(customer.getVAT_NUMBER())) {
                        System.out.print(account.getAccountId() + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }


    public void printAccountsReport() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountId());
            System.out.println("Date Opened: " + account.getCreationDate());
            System.out.print("Holders: ");
            for (Customer holder : account.getAccountHolders()) {
                System.out.print(holder.getFirstName() + " ");
            }
            System.out.println("\nBalance: " + account.getAccountBalance());
            System.out.println("Transaction History:");
            for (Transaction transaction : account.getTransactionHistory()) {
                System.out.println("Date: " + transaction.getDate() + " Type: " + transaction.getType()
                        + " Amount: " + transaction.getAmount());
            }
            System.out.println();
        }

    }
        public void printAccountTransactionHistory(Integer accountNumber) {
            Account account = findById(accountNumber, this.accounts);
            if(account==null){
                System.out.println("Invalid Account Number");
                return;
            }
            System.out.println("Transaction History for Account Number: " + account.getAccountId());
            for (Transaction transaction : account.getTransactionHistory()) {
                System.out.println("Date: " + transaction.getDate() + " Type: " + transaction.getType()
                        + " Amount: " + transaction.getAmount());
            }
        }


    public Account findById(Integer id, List<Account> accounts) {

        return accounts.stream().filter(account -> account.getAccountId().equals(id))
                .findFirst().get();
    }


}