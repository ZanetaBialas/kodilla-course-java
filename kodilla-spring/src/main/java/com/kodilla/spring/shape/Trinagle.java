package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Trinagle implements Shape {
    @Override
    public String getShapeName() {
        return "This is a triangle.";
    }
}
