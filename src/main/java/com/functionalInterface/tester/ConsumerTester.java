package com.functionalInterface.tester;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
public class ConsumerTester {
    public static void main(String[] args) {
        java.util.function.Consumer<Integer> integerConsumer = (Integer x) -> {
            if (x < 10)
                System.out.println("X is less than 10");
        };
        integerConsumer.accept(11);
    }
}
