package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void testHashMapClassic() {
        Map<Box, String> map = new HashMap<>();
        map.put(new Box(10, 40, 30), "Small Box");
        map.put(new Box(150, 410, 31), "Medium Box");
        map.put(new Box(1600, 4233, 3100), "Large Box");
        assertThat(map.get(new Box(1600, 4233, 3100))).isEqualTo("Large Box");
    }

    enum Colors {
        RED, YELLOW, GREEN
    }
    @Test
    void testHashMapEnum() {
        Map<Colors, Integer> map = new EnumMap<>(Colors.class);
        map.put(Colors.RED, 20);
        map.put(Colors.YELLOW, 10);
        assertThat(map.get(Colors.RED)).isEqualTo(20);
        assertThat(2.001).isCloseTo(2, Offset.offset(.02));
        assertThat("Hello").containsPattern("ell");
        assertThat(1202).isInstanceOf(Integer.class);
    }
}
