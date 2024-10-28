package com.functionalInterface;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
public class WithLambda {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface1 = (a, b) -> {
            System.out.println("Function Interface with Lambda : " + (a + b));
        };
        functionalInterface1.calculate(10, 10);
        functionalInterface1.sum(10, 10);
    }
}
