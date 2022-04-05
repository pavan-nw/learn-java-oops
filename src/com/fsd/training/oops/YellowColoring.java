package com.fsd.training.oops;

public class YellowColoring implements ColoringPattern {

    private String color = "Yellow";
    private String shade;

    public YellowColoring(String shade) {
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
