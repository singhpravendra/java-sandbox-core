package com.stream.codingproblems;

import java.util.*;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description:
 */
public class MaxAgePerson {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        //Max age person name
        persons.stream().max(Comparator.comparing(Person::getAge)).ifPresent(person -> System.out.println(person.getName()));
        Optional<Person> reduce = persons.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);
        System.out.println(reduce);
    }
}
