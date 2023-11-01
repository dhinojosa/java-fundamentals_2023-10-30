package com.xyzcorp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparisonTest {

    @Test
    void testTwoBoxes() {
        Box box1 = new Box(10.0, 30.0, 20.0);
        Box box2 = new Box(10.0, 30.0, 20.0);
        assertThat(box1.compareTo(box2)).isEqualTo(0);
    }

    @Test
    void testTwoBoxesWithOneLargerThanTheOther() {
        Box box1 = new Box(10.0, 30.0, 20.0);
        Box box2 = new Box(10.0, 30.0, 50.0);
        assertThat(box1).isLessThan(box2);
    }

    @Test
    void testTwoBoxesWithOneLargerThanTheOtherUsingCustomCompartor() {
        Box box1 = new Box(10.0, 30.0, 20.0);
        Box box2 = new Box(10.0, 130.0, 50.0);

        MyBoxSorterByHeight myBoxSorterByHeight = new MyBoxSorterByHeight();
        int result = myBoxSorterByHeight.compare(box1, box2);
        assertThat(result).isLessThan(0);
    }

    @Test
    void testSortCollectionsNaturalOrder() {
        List<Box> myBoxes = new ArrayList<>();
        myBoxes.add(new Box(10.0, 130.0, 50.0));
        myBoxes.add(new Box(10.0, 300.0, 30.0));
        myBoxes.add(new Box(11.0, 130.0, 50.0));
        myBoxes.add(new Box(130.0, 30.0, 90.0));
        myBoxes.add(new Box(90.0, 130.0, 100.0));
        myBoxes.add(new Box(80.0, 100.0, 120.0));
        myBoxes.add(new Box(1.0, 5.0, 2.0)); //smallest
        myBoxes.add(new Box(70.0, 130.0, 220.0));

        Collections.sort(myBoxes);
        System.out.println(myBoxes);
    }

    @Test
    void testSortCollectionsUsingComparator() {
        List<Box> myBoxes = new ArrayList<>();
        myBoxes.add(new Box(10.0, 130.0, 50.0));
        myBoxes.add(new Box(10.0, 300.0, 30.0));
        myBoxes.add(new Box(11.0, 130.0, 50.0));
        myBoxes.add(new Box(130.0, 30.0, 90.0)); //smallest
        myBoxes.add(new Box(90.0, 130.0, 100.0));
        myBoxes.add(new Box(80.0, 100.0, 120.0));
        myBoxes.add(new Box(1.0, 55.0, 2.0));
        myBoxes.add(new Box(70.0, 130.0, 220.0));

        Collections.sort(myBoxes, new MyBoxSorterByHeight());
        System.out.println(myBoxes);
    }

    @Test
    void testSortCollectionsUsingComparatorAnonymousClass() {
        List<Box> myBoxes = new ArrayList<>();
        myBoxes.add(new Box(10.0, 130.0, 50.0));
        myBoxes.add(new Box(10.0, 300.0, 30.0)); //smallest
        myBoxes.add(new Box(11.0, 130.0, 50.0));
        myBoxes.add(new Box(130.0, 30.0, 90.0));
        myBoxes.add(new Box(90.0, 130.0, 100.0));
        myBoxes.add(new Box(80.0, 100.0, 120.0));
        myBoxes.add(new Box(1.0, 55.0, 232.0));
        myBoxes.add(new Box(70.0, 130.0, 220.0));

        Collections.sort(myBoxes, (o1, o2) -> Double.compare(o1.depth(), o2.depth()));
        System.out.println(myBoxes);
    }

    @Test
    void testSortImmutableListUsingComparatorAnonymousClass() {
        List<Box> myBoxes = List.of(
            new Box(10.0, 130.0, 50.0),
            new Box(10.0, 300.0, 30.0),
            new Box(11.0, 130.0, 50.0),
            new Box(130.0, 30.0, 90.0),
            new Box(90.0, 130.0, 100.0),
            new Box(80.0, 100.0, 120.0),
            new Box(1.0, 55.0, 232.0),
            new Box(70.0, 130.0, 220.0));

        Collections.sort(myBoxes, (o1, o2) -> Double.compare(o1.depth(), o2.depth()));
        System.out.println(myBoxes);
    }

    @Test
    void testSortImmutableList() {
        List<Box> myBoxes = List.of(
            new Box(10.0, 130.0, 50.0),
            new Box(10.0, 300.0, 30.0),
            new Box(11.0, 130.0, 50.0),
            new Box(130.0, 30.0, 90.0),
            new Box(90.0, 130.0, 100.0),
            new Box(80.0, 100.0, 120.0),
            new Box(1.0, 55.0, 232.0),
            new Box(70.0, 130.0, 220.0));

        List<Box> list = myBoxes
            .stream()
            .sorted(new Comparator<Box>() {
                @Override
                public int compare(Box o1, Box o2) {
                    double v1 = o1.depth();
                    double v2 = o2.depth();

                    return Double.compare(v1, v2);
                }
            })
            .toList();

        System.out.println(myBoxes);
        System.out.println(list);
    }
}











