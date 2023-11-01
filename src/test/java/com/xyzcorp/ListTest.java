package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ListTest {

    @Test
    void testListLinkedList() {
        List<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        assertThat(integers).hasSize(3);
    }

    @Test
    void testListArrayList() {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        assertThat(integers).hasSize(3);
    }

    @Test
    void testListLinkedListUsingVar() {
        var integers = new LinkedList<Integer>();
        integers.add(10);
        integers.add(13);
        integers.add(15);
        assertThat(integers).hasSize(3);
    }

    @Test
    void testCreatingAListInOneLine() {
        List<Integer> list = Arrays.asList(10, 40, 50, 100, 120, 500, 600, 10029);
        assertThat(list).hasSize(8);
    }

    @Test
    void testCreateAListWithOf() {
        List<Integer> list = List.of(10, 40, 50, 100, 120, 500, 600, 10029);
    }

    public <T> int sizePlusOne(List<T> listOfIntegers) {
        return listOfIntegers.size();
    }

    @Test
    void testListOfIntegerCallAMethod() {
        List<Integer> integerList = List.of(1, 3, 5, 10);
        assertThat(sizePlusOne(integerList)).isEqualTo(4);
    }

    @Test
    void testListOfStringCallAMethod() {
        List<String> stringList = List.of("Hello", "How", "Are", "You");
        assertThat(sizePlusOne(stringList)).isEqualTo(4);
    }

    @Test
    void testListOfStringAsAnIterator() {
        List<String> stringList = List.of("Hello", "How", "Are", "You");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    void testListOfStringAsAnListIterator() {
        List<String> stringList = List.of("Hello", "How", "Are", "You");
        ListIterator<String> iterator = stringList.listIterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasPrevious());
        System.out.println(iterator.previous());
        System.out.println(iterator.hasPrevious());
        System.out.println(iterator.previous());
    }
}


















