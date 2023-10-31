package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxTest {

    @Test
    void testBoxToString() {
        Box box = new Box(30, 10, 40);
        Assertions.assertThat(box.toString())
            .isEqualTo("Box(width=30.0, height=10.0, depth=40.0)");
    }

    @Test
    void testBoxToStringDifferentValues() {
        Box box = new Box(50, 40, 120);
         Assertions.assertThat(box.toString())
            .isEqualTo("Box(width=50.0, height=40.0, depth=120.0)");
    }


}
