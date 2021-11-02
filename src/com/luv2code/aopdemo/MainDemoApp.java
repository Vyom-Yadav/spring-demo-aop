package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        // The AOP proxy class that spring creates, and we are talking about
        // Also see https://medium.com/trabe/understanding-aop-in-spring-from-magic-to-proxies-6f5911e5e5a8
        System.out.println(accountDAO.hashCode());

        // call the business method
        accountDAO.addAccount(accountDAO);

        // close the context
        context.close();
    }
}