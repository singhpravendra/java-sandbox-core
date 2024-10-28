package com.stream.codingproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description: Check if a list of integers contains a prime number using Java streams:
 */
public class PrimeNumber {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        PrimeNumber primeNumber = new PrimeNumber();


        boolean primeNumberExist = numbers.stream().anyMatch(primeNumber::isPrime);
        System.out.println("Prime number exist : " + primeNumberExist);
        List<Integer> list = numbers.stream().filter(primeNumber::isPrime).toList();
        System.out.println("Prime numbers: " + list);

    }
}
