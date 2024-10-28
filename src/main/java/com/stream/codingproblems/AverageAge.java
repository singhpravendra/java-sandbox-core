package com.stream.codingproblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description:
 */

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 35)
        );
        //With IntStream
        IntStream intStream = persons.stream().mapToInt(Person::getAge);
        System.out.println(intStream.average());

        //With Collectors averageInt()
        System.out.println(persons.stream().collect(Collectors.averagingInt(Person::getAge)));

        //With Collectors summarizing()
        IntSummaryStatistics status = persons.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(status.getAverage());
    }
}
