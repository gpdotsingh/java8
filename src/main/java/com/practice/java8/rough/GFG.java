package com.practice.java8.rough;

// Java Program to Get TreeMap Key, Value, then
// Entry Greater or Less than the Specified Value
// using lowerKey() and higherKey() of Tree class

// Importing all classes of
// java.util package
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a TreeMap
        TreeMap<Integer, String> tree
                = new TreeMap<Integer, String>();

        // Inserting the Elements into TreeMap
        tree.put(100, "=> Welcoming");
        tree.put(120, "=> you to ");
        tree.put(140, "=> computer science portal");
        tree.put(200, "=> Geeks for Geeks");

        // Returning the smallest key among all the keys
        // greater than 150
        System.out.println("Smallest key among key > 150 : "
                + tree.higherKey(150));

        // Returning the greatest key among all the keys
        // smaller than 150


        int k[] = {2,2,2,24,5,4};
        LinkedHashMap<int[], Long> collect = Arrays.asList(k)
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));


    }
}
