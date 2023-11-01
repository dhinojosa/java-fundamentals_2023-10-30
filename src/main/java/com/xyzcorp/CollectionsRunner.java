package com.xyzcorp;

import org.assertj.core.api.Assertions;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsRunner {

    public static void main(String[] args) {
        Person arethaFranklin = new Person("Aretha", "Franklin");
        Person elvisPresley = new Person("Elvis", "Presley");
        Person davidBowie = new Person("David", "Bowie");
        Person taylorSwift = new Person("Taylor", "Swift");
        Person johnnyCash = new Person("Johnny", "Cash");
        Person jimiHendrix = new Person("Jimi", "Hendrix");
        Person marvinGaye = new Person("Marvin", "Gaye");
        Person princeNelson = new Person("Prince", "Nelson");
        Person willieNelson = new Person("Willie", "Nelson");
        Person ladyGaga = new Person("Lady", "Gaga");
        Person garthBrooks = new Person("Garth", "Brooks");
        Person rickJames = new Person("Rick", "James");

        List<Person> singers = List.of(arethaFranklin, elvisPresley, davidBowie, taylorSwift, johnnyCash,
            jimiHendrix, marvinGaye, princeNelson, willieNelson, ladyGaga, garthBrooks, rickJames);

        singers.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        });

        Set<Person> singerSet = new HashSet<>();
        singerSet.add(arethaFranklin);
        singerSet.add(elvisPresley);
        singerSet.add(davidBowie);
        singerSet.add(taylorSwift);
        singerSet.add(johnnyCash);
        singerSet.add(jimiHendrix);
        singerSet.add(marvinGaye);
        singerSet.add(princeNelson);
        singerSet.add(willieNelson);
        singerSet.add(ladyGaga);
        singerSet.add(garthBrooks);
        singerSet.add(rickJames);

        Map<Person, List<String>> map = new HashMap<>();
        map.put(arethaFranklin, List.of("Soul"));
        map.put(elvisPresley, List.of("Rock and Roll"));
        map.put(davidBowie, List.of("Rock and Roll"));
        map.put(johnnyCash, List.of("Country"));
        map.put(jimiHendrix, List.of("Rock and Roll"));
        map.put(marvinGaye, List.of("Soul"));
        map.put(princeNelson, List.of("Funk"));
        map.put(willieNelson, List.of("Country"));
        map.put(ladyGaga, List.of("Pop"));
        map.put(garthBrooks, List.of("Country"));
        map.put(rickJames, List.of("Funk"));
        map.put(taylorSwift, List.of("Pop", "Country"));

        assertThat(map.get(taylorSwift)).hasSize(2);
    }
}
