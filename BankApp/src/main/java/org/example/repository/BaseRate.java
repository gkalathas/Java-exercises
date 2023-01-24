package org.example.repository;

public interface BaseRate {

    default double getBaseRate() {
        return 2.5;
    }
}
