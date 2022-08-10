package com.fsd.training.july2022.oops;

import com.fsd.training.july2022.exception.RadiusOutOfBondException;

public final class Circle extends Shape implements Draw {
    double radius;

    public Circle(String shapeName, double circleRadius) throws RadiusOutOfBondException {
        super(shapeName);
        if(circleRadius > 1000) {
            throw new RadiusOutOfBondException("Radius is too big", circleRadius);
        }
        this.radius = circleRadius;
    }

    @Override
    public void calculateArea() {
        this.area = PI * radius * radius;
        System.out.println("Area of circle " + this.area);
    }

    @Override
    public void drawWithSolidLine() {
        System.out.println("In circle: drawing in solid line");
    }

    @Override
    public void drawWithDottedLine() {
        System.out.println("In circle: drawing in dotted line");
    }

    @Override
    public void drawWithColor() {
        System.out.println("In circle: drawing in color");
    }

    public double getArea() {
        return area;
    }
}
