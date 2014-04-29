package com.thoughtworks.accountbalance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account testAcct = new Account(100);
        testAcct.deposit(50);
        assertThat(testAcct.amount(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account testAcct = new Account(100);
        testAcct.withdraw(50);
        assertThat(testAcct.amount(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account testAcct = new Account(50);
        testAcct.withdraw(100);
        assertThat(testAcct.amount(), is(50));
    }
}
