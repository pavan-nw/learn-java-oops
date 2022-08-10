package com.fsd.training.july2022.oops;

public abstract class Shape {
    private String name;
    protected double area;
    public static final double PI = 3.142;

    public Shape(String shapeName) {
      // Constructor
        this.name = shapeName;
    }

    public abstract void calculateArea();

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public final void displayArea() {
        System.out.println("Area: " + this.area);
    }
}
