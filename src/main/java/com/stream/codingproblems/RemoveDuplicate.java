package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: Remove duplicates from a list while preserving the order using Java streams
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> list = numbersWithDuplicates.stream().distinct().toList();
        System.out.println(list);
    }
}
