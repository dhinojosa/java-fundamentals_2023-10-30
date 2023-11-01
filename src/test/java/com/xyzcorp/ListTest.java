package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    @Test
    void testListLinkedList() {
        List<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        Assertions.assertThat(integers).hasSize(3);
    }

    @Test
    void testListArrayList() {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        Assertions.assertThat(integers).hasSize(3);
    }
    @Test
    void testListLinkedListUsingVar() {
        var integers = new LinkedList<Integer>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        Assertions.assertThat(integers).hasSize(3);
    }

    @Test
    void testCreatingAListInOneLine() {
        List<Integer> list = Arrays.asList(10, 40, 50, 100, 120, 500, 600, 10029);
        Assertions.assertThat(list).hasSize(8);
    }

    @Test
    void testCreateAListWithOf() {
        List<Integer> list = List.of(10, 40, 50, 100, 120, 500, 600, 10029);
    }
}


















