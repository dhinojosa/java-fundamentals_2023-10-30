package com.xyzcorp;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public record Person(String firstName,
                     String lastName,
                     LocalDate birthday,
                     Supplier<LocalDate> now) {

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null, null);
    }

    public Optional<Integer> age() {
        if (now == null) return Optional.empty();
        if (birthday == null) return Optional.empty();
        return Optional.of((int) YEARS.between(birthday, now.get()));
    }

    public static Person of(String firstName, String lastName, LocalDate birthDate) {
        return new Person(firstName, lastName, birthDate, () -> LocalDate.now());
    }
}
