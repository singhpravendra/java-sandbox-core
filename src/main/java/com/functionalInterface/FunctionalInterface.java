package com.functionalInterface;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    default void sum(int a, int b) {
        System.out.println(a + b);
    }

    void calculate(int a, int b);

    String toString();
}
