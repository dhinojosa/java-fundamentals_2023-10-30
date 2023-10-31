package com.xyzcorp;

public record Country(String name, String capital, long population) {
    public long tenYearProjection() {
        return (long) ((population/2) * 2.05);
    }
}
