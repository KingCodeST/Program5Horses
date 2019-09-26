package com.company;

public class Horse {



    private String name;
    private String colour;
    private double height;

    public Horse() {
    }

    public Horse(String name, String colour, double height) {
        this.name = name;
        this.colour = colour;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }
}
