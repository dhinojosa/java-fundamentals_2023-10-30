package com.xyzcorp;

import org.junit.jupiter.api.Test;

public class SwitchTest {


    @Test
    void testSwitch() {
        System.out.println(daysInMonth(8));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(11));
    }

    private static int daysInMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> 28;
        };
    }
}
