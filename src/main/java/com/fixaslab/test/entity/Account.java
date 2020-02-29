package com.fixaslab.test.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity(name="account")
public class Account {
    @Id
    @Column(name="accountNo")
    private int accountNo;
    private String accountName;
    private String accountSignatory;
    private Double balance;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "id")
    private User user;

    public Account() {
    }

    public Account(String accountName, String accountSignatory, Double balance) {
        this.accountName = accountName;
        this.accountSignatory = accountSignatory;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountSignatory() {
        return accountSignatory;
    }

    public void setAccountSignatory(String accountSignatory) {
        this.accountSignatory = accountSignatory;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountName='" + accountName + '\'' +
                ", accountSignatory='" + accountSignatory + '\'' +
                ", balance=" + balance +
                '}';
    }
}
