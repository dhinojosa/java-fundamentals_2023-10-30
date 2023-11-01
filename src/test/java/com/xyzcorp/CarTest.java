package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void testCarStatic() {
        Car testarossa = Car.of("Ferrari", "Testarossa");
        Car fusion = Car.of("Ford", "Fusion");
        long instances = Car.count(); //static
        Assertions.assertThat(instances).isGreaterThanOrEqualTo(2);
    }
}
