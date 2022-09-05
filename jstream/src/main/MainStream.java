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
                new Person("Alina Smith", 33,Gender.FEMALE)
        );

    }


}
