package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentCollectionsTest {

    @Test
    void testConcurrentList() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        List<Integer> synchronizedList = Collections.synchronizedList(list);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronizedList.add(30);
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronizedList.add(90);
            }
        };

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        Assertions.assertThat(synchronizedList).hasSize(5);
    }
}
