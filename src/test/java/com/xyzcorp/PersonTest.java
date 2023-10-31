package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonFirstName() {
        Person person = new Person("Prianka", "Kottapalli");
        String firstName = person.firstName();
        Assertions.assertThat(firstName).isEqualTo("Prianka");
    }

    @Test
    void testPersonLastName() {
        Person person = new Person("Prianka", "Kottapalli");
        String lastName = person.lastName();
        Assertions.assertThat(lastName).isEqualTo("Kottapalli");
    }

    @Test
    void testPersonEquality() {
        Person person1 = new Person("Prianka", "Kottapalli");
        Person person2 = new Person("Prianka", "Kottapalli");
        Assertions.assertThat(person1).isEqualTo(person2);
    }

    @Test
    void testPersonHashCodeEquality() {
        Person person1 = new Person("Prianka", "Kottapalli");
        Person person2 = new Person("Prianka", "Kottapalli");
        Assertions.assertThat(person1.hashCode()).isEqualTo(person2.hashCode());
    }

    @Test
    void testPersonToString() {
        Person person1 = new Person("Prianka", "Kottapalli");
        Assertions.assertThat(person1.toString())
            .isEqualTo("Person[firstName=Prianka, lastName=Kottapalli]");
    }
}
