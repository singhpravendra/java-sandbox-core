package com.functionalInterface.tester;

import java.util.function.Function;

/**
 * Author: pravendrasingh
 * Date: 24/10/24
 * Description: The Function interface represents a function that takes one argument and returns a result. It is often used for mapping or transforming data.
 */
public class FunctionTester {
    public static void main(String[] args) {
        Function<Integer, String> function = (Integer x) ->{
            return String.valueOf((x+1));
        };
        System.out.println(function.apply(100));

        // Function to square an integer
        Function<Integer, Integer> square = x -> x * x;

        // Function to convert an integer to string
        Function<Integer, String> intToString = String::valueOf;

        // Chain functions: square an integer and then convert it to string
        Function<Integer, String> squareThenString = square.andThen(intToString);

        // Apply the chained function
        String result = squareThenString.apply(5);
        System.out.println(result);  // Output: 25
    }
}
