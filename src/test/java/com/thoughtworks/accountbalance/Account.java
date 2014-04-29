package com.thoughtworks.accountbalance;

/**
 * Created by kelin on 4/29/14.
 */
public class Account {
    private int total;

    public Account (int amount) {
        total = amount;
    }

    public Integer amount() {
        return total;
    }

    public void deposit (int amount) {
        total += amount;
    }

    public void withdraw (int amount) {
        if (amount <= total) {
            total -= amount;
        }
    }
}
