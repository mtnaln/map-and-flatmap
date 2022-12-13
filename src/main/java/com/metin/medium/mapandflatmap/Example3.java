package com.metin.medium.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {
        List<List<Person>> personList = Arrays.asList(
                Arrays.asList(
                        new Person(1, "Metin", "Aln"),
                        new Person(2, "Kağan", "Aln"),
                        new Person(3, "Yusuf", "Aln"),
                        new Person(4, "Dilek", "Aln")
                ),
                Arrays.asList(
                        new Person(5, "Ahmet", "Davut"),
                        new Person(6, "Rıza", "Özkök"),
                        new Person(7, "Ali", "Can"),
                        new Person(8, "Ayşe", "Nur")
                ),
                Arrays.asList(
                        new Person(9, "Enver", "Akça"),
                        new Person(10, "Kağan", "Korkmaz"),
                        new Person(11, "Yusuf", "Sönmez"),
                        new Person(12, "Yılmaz", "Aln")
                )
        );

        System.out.println(personList);

        List<Integer> allIds = personList.stream()
                .flatMap(persons -> persons.stream())
                .map(person -> person.id)
                .collect(Collectors.toList());

        System.out.println(allIds);
    }

    static class Person {
        int id;
        String name;
        String surname;

        public Person(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
