package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {


    @Test
    void testHashSetOfTwoBoxesThatAreEqual() {
        Set<Box> boxHashSet = new HashSet<>();
        boxHashSet.add(new Box(50, 40, 120));
        boxHashSet.add(new Box(50, 40, 120));
        boxHashSet.add(new Box(50, 40, 120));
        Assertions.assertThat(boxHashSet).hasSize(1);
    }

    @Test
    void testSetDoesNotMaintainOrder() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(60);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(60);
        set.add(100);
        System.out.println(set);
    }

//    @Test
//    void testHashSetOfBoxesThatAreEqual() {
//        Set<Box> boxHashSet = new HashSet<>();
//
//        Box firstBox = new Box(50, 40, 120);
//        System.out.println(firstBox.hashCode());
//        boxHashSet.add(firstBox);
//
//        Box secondBox = new Box(50, 40, 120);
//        System.out.println(secondBox.hashCode());
//        boxHashSet.add(secondBox);
//
//        Box thirdBox = new Box(50, 40, 120);
//        System.out.println(thirdBox.hashCode());
//        boxHashSet.add(thirdBox);
//
//        Assertions.assertThat(boxHashSet).hasSize(1);
//
//        firstBox.setWidth(17);
//        System.out.println(firstBox.hashCode());
//        System.out.println(boxHashSet);
//
//        Assertions.assertThat(boxHashSet).hasSize(1);
//    }

//    @Test
//    void testSetIntesection() {
//        List<Integer> set = new ArrayList<>();
//        set.add(10);
//        set.add(20);
//        set.add(30);
//
//        List<Integer> set2 = new ArrayList<>();
//        set2.add(20);
//        set2.add(40);
//        set2.add(60);

//        Collections.
//        System.out.println(set);
//    }
}
