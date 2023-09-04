package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Qualifier("division")
    @Autowired
    Operation operation;

    public void calc(double a, double b) {
        System.out.println(operation.getResult(a, b));
    }
}

