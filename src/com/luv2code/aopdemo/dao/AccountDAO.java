package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(AccountDAO obj) {
        System.out.println(this.hashCode() + " " + obj.hashCode());
    }

}
