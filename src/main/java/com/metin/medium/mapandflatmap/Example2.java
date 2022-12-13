package com.metin.medium.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        // map()
        List<Person> personList = Arrays.asList(
                new Person(1, "Metin", "Aln"),
                new Person(2, "Kağan", "Aln"),
                new Person(3, "Yusuf", "Aln"),
                new Person(4, "Dilek", "Aln")
        );

        System.out.println(personList);

        List<String> idList = personList.stream()
                .map(person -> person.id)
                .map(id -> id.toString())
                .collect(Collectors.toList());

        System.out.println(idList);
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
