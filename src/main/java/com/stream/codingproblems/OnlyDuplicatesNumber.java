package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: List all duplicates from a list using Java streams:
 */
public class OnlyDuplicatesNumber {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        //Using group
        Map<Integer, Long> eachNumberCount = numbersWithDuplicates.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        //Get all numbers
        List<Integer> duplicateNumbers = numbersWithDuplicates.stream().filter(num -> eachNumberCount.get(num) > 1).toList();
        System.out.println(duplicateNumbers);

        //Get the occurrence
        Stream<Map.Entry<Integer, Long>> duplicateNumberWithOccurrence = eachNumberCount.entrySet().stream().filter(x -> x.getValue() > 1);
        duplicateNumberWithOccurrence.forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));

    }
}
