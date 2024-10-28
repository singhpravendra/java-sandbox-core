package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: 6. Merge two sorted lists into a single sorted list using Java streams
 */
public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 50, 70, 90);
        List<Integer> list2 = Arrays.asList(11, 22, 33, 45, 57, 99);

        Stream<Integer> concat = Stream.concat(list1.stream(), list2.stream());
        Stream<Integer> sorted = concat.sorted();
        List<Integer> sortedList = sorted.toList();
        System.out.println(sortedList);
    }
}
