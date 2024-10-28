package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: Find the intersection of two lists using Java streams:
 */
public class InsertionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 50, 70, 90);
        List<Integer> list2 = Arrays.asList(11, 20, 33, 70, 50, 50);

        List<Integer> list = list1.stream().filter(list2::contains).toList();
        System.out.println(list);

    }
}
