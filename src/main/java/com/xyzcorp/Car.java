package com.xyzcorp;

public record Car(String make, String model) {
    private static long count;

    public static long count() {
        return count;
    }

    public static Car of(String make, String model) {
        if (make == null) throw new NullPointerException("make cannot be null");
        if (model == null) throw new NullPointerException("model cannot be null");
        if (make.isEmpty()) throw new IllegalArgumentException("make cannot be an empty string");
        if (model.isEmpty()) throw new IllegalArgumentException("model cannot be an empty string");
        if (count == 50) throw new IllegalStateException("Limit of instances reached");
        Car car = new Car(make, model);
        count++;
        return car;
    }
}
