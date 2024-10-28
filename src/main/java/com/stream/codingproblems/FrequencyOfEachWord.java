package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: pravendrasingh
 * Date: 29/10/24
 * Description: Given a list of strings, find the frequency of each word using Java streams
 */
public class FrequencyOfEachWord {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> frequency = words.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(frequency);
    }
}
