package com.stream.codingproblems;

import java.util.Comparator;
import java.util.List;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description:
 */
public class LongestString {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "cherry", "date", "grapefruit");
        System.out.println(list.stream().max(Comparator.comparingInt(String::length)));
    }
}
