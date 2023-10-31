package com.xyzcorp;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
    }

    public Box(double i, double j, double k) {
        width = i;
        height = j;
        depth = k;
    }

    @Override
    public String toString() {
        return String.format("Box(width=%.1f, height=%.1f, depth=%.1f)", width, height, depth);
    }
}






