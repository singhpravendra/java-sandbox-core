package com.finalAndEffectiveFinal;

/**
 * Author: pravendrasingh
 * Date: 27/10/24
 * Description:
 */
public class FinalVariableExample {
    public static void main(String[] args) {
        final int value = 10;

        // The following line would cause a compilation error:
        // value = 20; // Error: Cannot assign a value to final variable value

        System.out.println("Final Value: " + value);
    }
}

