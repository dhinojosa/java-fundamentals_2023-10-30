package com.xyzcorp;

import java.util.Comparator;

public class MyBoxSorterByHeight implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        return Double.compare(o1.height(), o2.height());
    }
}
