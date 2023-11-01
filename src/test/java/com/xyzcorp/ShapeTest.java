package com.xyzcorp;

import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    void testShape() {
        Rectangle rectangle = new Rectangle(10, 40);

        Shape shape = rectangle;
        Object object = rectangle;
        Rectangle rectangle1 = rectangle;

        System.out.println(shape.name());
        System.out.println(shape.description());
    }
}
