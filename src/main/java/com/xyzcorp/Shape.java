package com.xyzcorp;

public abstract class Shape {
    public abstract int area();

    public abstract String name();

    public String description() {
        return String.format("Shape named: %s with an area of %d%n", name(), area());
    }
}
