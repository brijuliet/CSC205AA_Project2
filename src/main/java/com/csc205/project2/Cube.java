package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double width) {
        super();
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return 6.0 * Math.pow(width, 2);
    }

    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        String sb = "Cube{" + "width=" + width +
                ", surface area=" + surfaceArea() +
                ", volume=" + volume() +
                '}';
        return sb;
    }

}
