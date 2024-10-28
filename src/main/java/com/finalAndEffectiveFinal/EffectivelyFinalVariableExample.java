package com.finalAndEffectiveFinal;

public class EffectivelyFinalVariableExample {
    public static void main(String[] args) {
        int value; // This variable is not declared as final.

        value = 10;
        // The variable `value` is effectively final because it is not modified after this assignment.
        // value = 20;   // Uncommenting this line would cause an error in a lambda expression below
        Runnable runnable = () -> System.out.println("Value: " + value);

        // Uncommenting the next line would cause a compilation error because it would make `value` non-final.
        // value = 20; // Error: Cannot use a non-final variable in a lambda expression

        runnable.run(); // Output: Value: 10
    }
}
