package org.example;

import org.example.domain.Account;
import org.example.domain.Bank;
import org.example.domain.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("George", "Kalathas", "123123123");
        Customer customer1 = new Customer("George", "Kalathas", "867867");
        Customer customer2 = new Customer("George", "Kalathas", "dftghfghjfh");
        Customer customer3 = new Customer("George", "Kalathas", "efghfh");
        Customer customer4 = new Customer("George", "Kalathas", "fghfh");
        Customer customer5 = new Customer("George", "Kalathas", "ehfghfgh");
        Customer customer6 = new Customer("George", "Kalathas", "eghhfghfgh");
        Customer customer7 = new Customer("George", "Kalathas", "hfghfhf");
        Customer customer8 = new Customer("George", "Kalathas", "hfghfghfgh");
        Customer customer9 = new Customer("George", "Kalathas", "fghfhfghfg");


        Account account = new Account( customer);
        Account account1 = new Account( customer1);
        Account account2 = new Account(customer2);
        Account account3 = new Account(customer3);
        Account account4 = new Account(customer4);
        Account account5 = new Account(customer5);
        Account account6 = new Account(customer6);
        Account account7 = new Account( customer7);
        Account account8 = new Account( customer8);
        Account account9 = new Account(customer9);

        Bank ethnikiBank = new Bank();
        ethnikiBank.addAccount(account);
        ethnikiBank.addAccount(account1);
        ethnikiBank.addAccount(account2);
        ethnikiBank.addAccount(account3);
        ethnikiBank.addAccount(account4);
        ethnikiBank.addAccount(account5);
        ethnikiBank.addAccount(account6);
        ethnikiBank.addAccount(account7);
        ethnikiBank.addAccount(account8);
        ethnikiBank.addAccount(account9);

        account5.addAccountHolders(customer1);
        account5.addAccountHolders(customer3);
        account5.addAccountHolders(customer);


        //displaying menu
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome ");
        System.out.println("What would you like to do?");
        System.out.println("1.Make a withdrawal.");
        System.out.println("2. Make a deposit.");
        System.out.println("3. Make a transfer.");
        System.out.println("4. Show transaction history.");
        System.out.println("5. Draft a check.");
        System.out.println("0. Exit.");


        do {
            System.out.println("Choose an option.");
            choice = scan.nextInt();
            System.out.println();

            switch(choice) {

                case 1:
                    System.out.println("Please enter your account number");
                    int number = scan.nextInt();
                    System.out.println("Enter the amount to withdraw");
                    double amount = scan.nextDouble();
                    ethnikiBank.withdraw(number, amount);
                    System.out.println();
                    break;

                case 2:

                    System.out.println("Please enter account number");
                    Integer accountNumber = scan.nextInt();
                    System.out.println("Enter an amount to deposit.");
                    double amount1 = scan.nextDouble();
                    ethnikiBank.deposit(accountNumber, amount1);

                    System.out.println();
                    break;

                case 3:
                    System.out.println("Please enter your account number ");
                    Integer accountFrom = scan.nextInt();
                    System.out.println("Please enter the account number to transfer the money");
                    Integer accountTo = scan.nextInt();
                    System.out.println("Enter an amount to transfer.");
                    int transferAmount = scan.nextInt();
                    ethnikiBank.transfer(accountFrom, accountTo, transferAmount);
                    break;

                case 4:
                    System.out.println("Please enter account number");
                    Integer ac = scan.nextInt();
                    ethnikiBank.printAccountTransactionHistory(ac);
                    break;

                case 5:
                    System.out.println("Please enter account number.");
                    Integer ac1 = scan.nextInt();
                    System.out.println("Please enter the amount.");
                    Double am = scan.nextDouble();
                    System.out.println("Please insert a short memo.");
                    String memo = scan.nextLine();
                    ethnikiBank.draftCheck(ac1, am, memo);
                case 0:
                    break;

                default:
                    System.out.println("Error -- Please choose a valid option.");
            }
        } while (choice != 0);
        System.out.println("Thank you for using the Bank Account Tracker!");

        scan.close();


    }
}