package com.stream.codingproblems;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Author: pravendrasingh
 * Date: 29/10/24
 * Description: Find the kth smallest element in an array using Java streams
 */
public class KthSmallElementInArray {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 3, 8};
        int k = 6;
        //Arrays.sort(array);
        OptionalInt smallest = Arrays.stream(array).sorted().skip(k - 1).findFirst();
        System.out.println(smallest);


    }
}
