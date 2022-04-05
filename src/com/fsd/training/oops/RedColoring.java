package com.fsd.training.oops;

public class RedColoring implements ColoringPattern {

    private String color = "RED";
    private String shade;

    public RedColoring(String shade) {
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
