package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class BoxTest {

    @Test
    void testBoxCreationWithNoArgConstructor() {
        Box box = new Box();
        Assertions.assertThat(box.width()).isEqualTo(1.0);
        Assertions.assertThat(box.height()).isEqualTo(1.0);
        Assertions.assertThat(box.depth()).isEqualTo(1.0);
    }

    @Test
    void testBoxToString() {
        Box box = new Box(30, 10, 40);
        Assertions.assertThat(box.toString())
            .isEqualTo("Box(width=30.0, height=10.0, depth=40.0)");
    }

    @Test
    void testBoxToStringDifferentValues() {
        Box box = new Box(50, 40, 120);
         Assertions.assertThat(box.toString())
            .isEqualTo("Box(width=50.0, height=40.0, depth=120.0)");
    }

    @Test
    void testThatTwoBoxesWithSameDimensions() {
        Box box1 = new Box(50, 40, 120);
        Box box2 = new Box(50, 40, 120);
        Assertions.assertThat(box1).isEqualTo(box2);
    }

    @Test
    void testThatTwoBoxesWithDifferentDimensions() {
        Box box1 = new Box(50, 40, 120);
        Box box2 = new Box(50, 40, 110);
        Assertions.assertThat(box1).isNotEqualTo(box2);
    }

    @Test
    void testTwoEqualObjectsWillHaveTheSameHash() {
        Box box1 = new Box(50, 40, 120);
        Box box2 = new Box(50, 40, 120);
        Assertions.assertThat(box1.hashCode()).isEqualTo(box2.hashCode());
    }

    @Test
    void testHashSetOfTwoBoxesThatAreEqual() {
        HashSet<Box> boxHashSet = new HashSet<>();
        boxHashSet.add(new Box(50, 40, 120));
        boxHashSet.add(new Box(50, 40, 120));
        boxHashSet.add(new Box(50, 40, 120));
        Assertions.assertThat(boxHashSet).hasSize(1);
    }
}
