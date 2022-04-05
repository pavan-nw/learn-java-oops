package com.fsd.training.oops;

public class ColoredSquare extends Square {

    private ColoringPattern coloringPattern;

    public ColoredSquare(double side, ColoringPattern coloringPattern) {
        super(side);
        this.coloringPattern = coloringPattern;
    }

    public void coloringSquare() {
        System.out.println("Coloring square with " + coloringPattern.getColor() + " with shade " + coloringPattern.getShade());
    }
}
