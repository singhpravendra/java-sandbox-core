package com.functionalInterface.tester;

import java.util.function.Predicate;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */

public class ProducerTester {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer x) -> {
            return x % 2 == 0;
        };
        System.out.println(isEven.test(10));
    }
}
