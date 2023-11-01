package com.xyzcorp;

public class Rectangle extends Shape{

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public String description() {
        return super.description() + "!";
    }
}
