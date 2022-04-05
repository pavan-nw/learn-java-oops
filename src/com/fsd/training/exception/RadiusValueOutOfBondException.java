package com.fsd.training.exception;

public class RadiusValueOutOfBondException extends Exception {
    private double causedRadius;

    public RadiusValueOutOfBondException(String message, double causedRadius) {
        super(message + " caused radius value is : " + causedRadius);
        this.causedRadius = causedRadius;
    }

    public void displayCausedRadius() {
        System.out.println("Radius value caused exception: " + causedRadius);
    }
}
