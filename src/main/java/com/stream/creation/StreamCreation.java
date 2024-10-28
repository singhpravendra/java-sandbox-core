package com.stream.creation;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

/**
 * Author: pravendrasingh
 * Date: 28/10/24
 * Description:
 */
public class StreamCreation {
    public static void main(String[] args) {

        //1. From Stream.of()
        Stream<String> fromStreamOf = Stream.of("John", "Doe");
        fromStreamOf.forEach(System.out::println);

        //2. From Arrays.stream()
        Stream<String> fromArray = Arrays.stream(new String[]{"John", "Doe"});
        fromArray.forEach(System.out::println);

        //3. From collection
        List<String> list = Arrays.asList("John", "Doe");
        Set<String> set = Set.of("John", "Doe");
        Map<String, String> map = Map.of("name", "john", "age", "25");
        Stream<String> listStream = list.stream();
        Stream<String> setStream = set.stream();
        Stream<Map.Entry<String, String>> mapStream = map.entrySet().stream();
        listStream.forEach(System.out::println);
        setStream.forEach(System.out::println);
        mapStream.forEach(System.out::println);

        //4. From Stream Builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.add("John");
        streamBuilder.add("Doe");
        Stream<String> builderStream = streamBuilder.build();
        builderStream.forEach(System.out::println);

        //5. From Stream.generate
        Stream<Double> generate = Stream.generate(Math::random).limit(5);
        generate.forEach(System.out::println);

        //6. From Stream.iterate
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(5);
        iterate.forEach(System.out::println);

        //From a range -> IntStream,DoubleStream etc
        IntStream range = IntStream.range(1, 5);
        int sum1 = range.sum();
        System.out.println(sum1);

        //From a range -> LongStream
        LongStream longStream = LongStream.rangeClosed(1, 5);
        OptionalDouble average = longStream.average();
        System.out.println(average);

        LongStream longStream1 = LongStream.rangeClosed(1, 5);
        longStream1.forEach(System.out::println); // Prints 1 to 5

        long sum = LongStream.range(1, 5).sum(); // 10 (1+2+3+4)
        System.out.println("Sum: " + sum);

        //From a DoubleStream
        DoubleStream doubleStream = DoubleStream.of(1.5, 2.5, 3);
        System.out.println(doubleStream.sum());

        //From Pattern.splitAsStream()
        String string = "Alice,Bob,Charlie";
        Stream<String> stream = Pattern.compile(",").splitAsStream(string);
        Set<String> collect = stream.collect(Collectors.toSet());
        System.out.println(collect);

        //From  - Stream.empty()
        Stream<String> emptyStream = Stream.empty();
        // Check if the stream is empty and perform an operation
        long count = emptyStream.count();
        System.out.println("Count of elements in the empty stream: " + count);

    }
}
