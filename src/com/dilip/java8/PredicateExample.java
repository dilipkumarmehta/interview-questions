package com.dilip.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Define a Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Filter and print even numbers
        numbers.stream()
               .filter(isEven)
               .forEach(number -> System.out.println(number));
    }
}