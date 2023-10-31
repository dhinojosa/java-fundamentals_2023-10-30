package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountryTest {
    @Test
    void testCreationOfCountry() {
        Country country = new Country("India", "New Delhi", 1408000000);
        String capital = country.capital();
        Assertions.assertThat(capital).isEqualTo("New Delhi");
    }


    @Test
    void testEqualityOfCountry() {
        Country india1 = new Country("India", "New Delhi", 1408000000);
        Country india2 = new Country("India", "New Delhi", 1408000000);
        Assertions.assertThat(india1).isEqualTo(india2);
    }
    @Test
    void testHashCodeOfCountry() {
        Country india1 = new Country("India", "New Delhi", 1408000000);
        Country india2 = new Country("India", "New Delhi", 1408000000);
        Assertions.assertThat(india1.hashCode()).isEqualTo(india2.hashCode());
    }

    @Test
    void testToStringOfCountry() {
        Country india = new Country("India", "New Delhi", 1408000000);
        Assertions.assertThat(india.toString()).isEqualTo("Country[name=India, capital=New Delhi]");
    }
}
