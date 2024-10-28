package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: Get the duplicate person by name
 * SQL :
 * SELECT *
 * FROM Person
 * WHERE name IN (
 *     SELECT name
 *     FROM Person
 *     GROUP BY name
 *     HAVING COUNT(*) > 1
 * );
 */

public class DuplicatePersonByName {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 20),
                new Person("Doe", 25),
                new Person("Bob", 30),
                new Person("Bob", 31),
                new Person("Bob", 32),
                new Person("Charlie", 35),
                new Person("Charlie", 32)
        );
        //1. Group the person by name
        Map<String, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(Person::getName));
        //System.out.println(collect);
        //2. Get the Duplicate entries with same person name
        Map<String, List<Person>> duplicatePersonByName = collect.entrySet().stream().filter(personName -> personName.getValue().size() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //System.out.println(duplicatePersonByName);
        //3. Traverse the person Duplicate map
        duplicatePersonByName.forEach((name, personList)->{
            System.out.println(name);
            personList.forEach(System.out::println);
        });


        // 2- With help of distinct
        // a - Get the occurrence or count of each name
        // b - Get the distinct record from the Persons data where name count > 1
        // c - Print the result

        System.out.println("Implementation 2 ----------");
        Map<String, Long> nameOccurrence = persons.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        System.out.println(nameOccurrence);
        Stream<Person> personStream = persons.stream().filter(person -> nameOccurrence.get(person.getName()) > 1);
        personStream.forEach(System.out::println);


    }
}
