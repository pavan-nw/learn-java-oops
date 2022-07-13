package com.fsd.training.apr2022.oops;

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
