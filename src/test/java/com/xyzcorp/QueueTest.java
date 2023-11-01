package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    void testQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(40);
        boolean result = queue.offer(50);
        assert(result);
        boolean result2 = queue.offer(60);
        assert(result2);
        Assertions.assertThat(queue.peek()).isEqualTo(40);
        Assertions.assertThat(queue.poll()).isEqualTo(40);
    }
}
