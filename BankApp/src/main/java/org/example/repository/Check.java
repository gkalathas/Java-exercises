package org.example.repository;

import java.time.LocalDate;

public class Check {

    private int checkNumber;
    private LocalDate date;
    private String holder;
    private double amount;
    private String memo;


    public Check(int checkNumber, String holder, double amount, String memo) {
        this.checkNumber = checkNumber;
        this.date = LocalDate.now();
        this.holder = holder;
        this.amount = amount;
        this.memo = memo;
    }

    public int getCheckNumber() {
        return checkNumber;
    }
}
