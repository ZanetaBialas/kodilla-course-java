package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void dispalyValue(double val) {
        System.out.println(val);
    }
}
