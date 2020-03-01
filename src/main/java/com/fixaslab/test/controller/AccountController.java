package com.fixaslab.test.controller;

import com.fixaslab.test.entity.Account;
import com.fixaslab.test.entity.User;
import com.fixaslab.test.service.AccountService;
import com.fixaslab.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserService userService;

    @RequestMapping("/account/create/{userId}")
    public Account createAccount(@PathVariable int userId, Account account){
        User user = this.userService.getUser(userId);
        Account newAccount = this.accountService.createAccount(account);
        newAccount.setUser(user);
        return newAccount;
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
