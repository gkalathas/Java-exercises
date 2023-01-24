package org.example.repository;

import java.time.LocalDate;
public class Transaction {

    private LocalDate date;
    private String holder;
    private String type;
    private double amount;
    private String memo;

    public Transaction() {
    }

    public Transaction(LocalDate date,String type , double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }


    public Transaction(LocalDate date, String holder, String type, double amount, String memo) {
        this.date = date;
        this.holder = holder;
        this.type = type;
        this.amount = amount;
        this.memo = memo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
