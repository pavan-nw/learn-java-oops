package com.fsd.training.oops;

public class BlueColoring implements ColoringPattern {

    private String color = "BLUE";
    private String shade;

    public BlueColoring(String shade) {
        this.shade = shade;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getShade() {
      return this.shade;
    }
}
