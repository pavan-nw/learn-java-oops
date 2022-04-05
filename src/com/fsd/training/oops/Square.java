package com.fsd.training.oops;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void computeArea() {
        this.area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }

    @Override
    public void drawWithDottedLine() {
        System.out.println("Drawing square in dotted line");
    }
}
