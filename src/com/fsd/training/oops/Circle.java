package com.fsd.training.oops;

import com.fsd.training.exception.RadiusValueOutOfBondException;

public class Circle extends Shape {
    private final double radius;
    private static final double PI = 3.142;

    public Circle(double radius) throws RadiusValueOutOfBondException {
        if (radius > 1000){
            throw new RadiusValueOutOfBondException("Radius value is very big", radius);
        }
        this.radius = radius;
    }

    public void computeArea() {
        this.area = PI * radius * radius;
    }

    public static void displayPIInfo(String displayStr) {
        System.out.println(displayStr + PI);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void drawWithDottedLine() {
        System.out.println("Drawing circle in dotted lines");
    }
}
