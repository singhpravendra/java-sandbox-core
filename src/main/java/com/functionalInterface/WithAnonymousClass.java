package com.functionalInterface;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
public class WithAnonymousClass {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new FunctionalInterface() {
            public void calculate(int a, int b) {
                System.out.println("Function Interface Using Anonymous Class");
            }
        };
        functionalInterface.calculate(10, 10);
    }
}
