package com.fixaslab.test.service;

import com.fixaslab.test.entity.Account;
import com.fixaslab.test.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return this.accountRepository.save(account);
    }

    public String withdraw(int accountNo, Double amount){
       Account account = this.accountRepository.findById(accountNo).get();
       if(account.getBalance() >= amount){
           account.setBalance(account.getBalance() - amount);
       }else{
           return "Insufficient fund";
       }
       return "Cash disbursed, Transaction successful";
    }

    public String deposit(int accountNo, Double amount){
        Account account = this.accountRepository.findById(accountNo).get();
        account.setBalance(account.getBalance() + amount);
        return "Transaction successful";
    }

    public void updateAccount(Account account){
        this.accountRepository.save(account);
        return;
    }

    public Account getAccount(int id){
        return this.accountRepository.findById(id).get();
    }

    public void deleteAccount(int id){
        this.accountRepository.deleteById(id);
    }
}
