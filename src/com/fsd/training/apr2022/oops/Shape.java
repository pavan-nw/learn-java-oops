package com.fsd.training.apr2022.oops;

public abstract class Shape implements DrawInRedColor, DrawInGreenColor {
    double area;

    public abstract void computeArea();

    public void displayArea() {
        System.out.println("Area of shape: " + area);
    }

    @Override
    public final void drawInRedColor() {
        System.out.println("Drawing shape in red color");
    }

    @Override
    public void drawInGreenColor() {
        System.out.println("Drawing shape in green color");
    }
}
