package main;

import resource.Gender;
import resource.Person;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<Person> people = getPeople();

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33,Gender.FEMALE),
                new Person("Helen White", 57,Gender.FEMALE),
                new Person("Alex Boz", 14,Gender.MALE),
                new Person("Jemie Goa", 99,Gender.MALE),
                new Person("Anna Cock", 7,Gender.FEMALE),
                new Person("Zelda Brown", 120,Gender.FEMALE)
        );

    }


}
