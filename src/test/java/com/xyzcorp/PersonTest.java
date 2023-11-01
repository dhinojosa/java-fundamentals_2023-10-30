package com.xyzcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;

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


    @Test
    void testPersonWithBirthday() {
        Person person = Person.of("Bjarne", "Strousoup", LocalDate.of(1950, 12, 30));
        Optional<Integer> age = person.age();
        Assertions.assertThat(age).contains(72);
    }


    @Test
    void testPersonWithBirthdayAndCurrentDateOfMyChoosing() {
        Person person = new Person("Bjarne", "Strousoup",
            LocalDate.of(1950, 12, 30), () -> LocalDate.of(2023, 4, 19));
        Optional<Integer> age = person.age();
        Assertions.assertThat(age).contains(72);
    }

}
