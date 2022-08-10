package com.fsd.training.july2022.exception;

public class RadiusOutOfBondException extends Exception {
    private double radius;

    public RadiusOutOfBondException(String message, double radius) {
        super(message);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
