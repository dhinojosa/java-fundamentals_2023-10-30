package com.xyzcorp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.toHexString;
import static org.assertj.core.api.Assertions.assertThat;

public class PrimitivesTest {

    @Test
    void testByte() {
        //byte, short, int, long, float, double, character, boolean
        // 01111111 = 127
        byte largestByte = 127;
        byte smallestByte = -128;
    }



    @Test
    void testShort() {
        //maxShort = 2^(16-1)-1
        //minShort = -2^(n-1)
        // 0111111111111111
        short largestShort = 32767;
        short smallestShort = -32768;
    }

    @Test
    void testInt() {
        int largestInt = 2147483647;
        int shortestInt = -2147483648;
    }

    @Test
    void testIntegerWrapper() {
        //error: you do not call the constructor
        Integer i = 10;
        assertThat(Integer.toHexString(i)).isEqualTo("00000000000000100");
    }

    @Test
    void testWhyDoWeNeedTheWrapper() {
        List<Integer> integers = new ArrayList<>();

    }
}
