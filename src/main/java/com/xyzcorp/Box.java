package com.xyzcorp;

import java.util.Objects;

public class Box {
    private final double width;
    private final double height;
    private final double depth;

    public Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        else if (o instanceof Box other) {
            return Objects.equals(this.width, other.width) &&
                   Objects.equals(this.height, other.height) &&
                   Objects.equals(this.depth, other.depth);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Box(width=%.1f, height=%.1f, depth=%.1f)", width, height, depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double depth() {
        return depth;
    }
}






