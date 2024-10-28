package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: pravendrasingh
 * Date: 29/10/24
 * Description: Implement a method to partition a list into two groups(even and odd) based on a predicate using Java streams:
 */
public class DataTypePartition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evenNumber = collect.get(true);
        List<Integer> oddNumber = collect.get(false);
        System.out.println(evenNumber);
        System.out.println(oddNumber);
    }
}
