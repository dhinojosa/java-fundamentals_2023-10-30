package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    void testArrays() {
        int[] arrayInts = new int[20];
        arrayInts[0] = 10;
        arrayInts[1] = 20;
        arrayInts[2] = 40;
        Assertions.assertThat(arrayInts[1]).isEqualTo(20);
        Assertions.assertThat(arrayInts[10]).isEqualTo(0);
    }

    @Test
    void testArraysCreationInOneLine() {
        int[] arrayInts = new int[]{10, 20, 40};
        Assertions.assertThat(arrayInts[1]).isEqualTo(20);
    }

    @Test
    void testArraysExpandAnArray() {
        int[] arrayInts = new int[]{10, 20, 40};
        int[] newArrayInts = Arrays.copyOf(arrayInts, 1200);

        Assertions.assertThat(arrayInts[1]).isEqualTo(20);
        Assertions.assertThat(newArrayInts[10]).isEqualTo(0);
    }
}
