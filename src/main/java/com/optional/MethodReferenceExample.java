package com.optional;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.thread.MyThreadJoin.names;


public class MethodReferenceExample {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printMessage1(String message) {
        System.out.println(message);
    }

    public static <List> void main(String[] args) {
        MethodReferenceExample obj = new MethodReferenceExample();

        // Using lambda expression
        Consumer<String> lambda = msg -> obj.printMessage(msg);

        // Using method reference to an instance method of a specific object
        Consumer<String> methodRef = obj::printMessage;
        Consumer<String> methodRef1 = obj::printMessage1;

        methodRef.accept("Hello, World!"); // Output: Hello, World!
        methodRef1.accept("Hello, World 1!"); // Output: Hello, World!

        IntSummaryStatistics stats = Stream.of(1, 2, 3, 4).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getSum());  // Output: 10
        Map<String, Integer> nameLengthMap = Stream.of("John", "Jane", "Jack")
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(nameLengthMap); // Output: {John=4, Jane=4, Jack=4}
        System.out.println(stats);
// Output: {true=[John, Jane, Jack], false=[]}


    }
}