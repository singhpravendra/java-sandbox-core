package com.functionalInterface.tester;

import java.util.function.Supplier;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
public class SupplierTester {
    public static void main(String[] args) {
        Supplier<Double> random = Math::random;
        System.out.println(random.get());
    }
}
