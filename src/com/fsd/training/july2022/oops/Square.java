package com.fsd.training.july2022.oops;

public class Square extends Shape implements Draw {
    private double side;

    public Square(String shapeName, double side) {
        super(shapeName);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        this.area = side * side;
        System.out.println("Area of square " + this.area);
    }

    public double getSide() {
        return side;
    }

    @Override
    public void drawWithSolidLine() {
        System.out.println("In square: drawing in solid line");
    }

    @Override
    public void drawWithDottedLine() {
        System.out.println("In square: drawing in dotted line");
    }

    @Override
    public void drawWithColor() {
        System.out.println("In square: drawing in color line");
    }

    public double getArea() {
        return area;
    }
}
