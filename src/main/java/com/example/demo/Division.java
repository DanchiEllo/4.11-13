package com.example.demo;

import org.springframework.stereotype.Component;

@Component("division")
public class Division implements Operation {
    @Override
    public double getResult(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
