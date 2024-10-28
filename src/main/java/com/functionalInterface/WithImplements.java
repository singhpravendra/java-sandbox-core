package com.functionalInterface;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description:
 */
class WithImplements implements FunctionalInterface {
    @Override
    public void calculate(int a, int b) {
        System.out.println("With implements ");
    }

    public static void main(String[] args) {
        WithImplements withImplements = new WithImplements();
        withImplements.calculate(10, 10);
    }
}
