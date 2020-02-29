package com.fixaslab.test.controller;

import com.fixaslab.test.entity.Account;
import com.fixaslab.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/create")
    public Account createAccount(Account account){
        return this.accountService.createAccount(account);
    }

    @RequestMapping("/account/deposit")
    public String accountDeposit(@RequestBody Double amount, int accountNo){
        return this.accountService.deposit(accountNo,amount);
    }

    @RequestMapping("/account/withdraw")
    public String withdrawal(@RequestBody Double amount, int accountNo){
        return this.accountService.withdraw(accountNo, amount);
    }
}
