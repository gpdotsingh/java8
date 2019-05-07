package com.practice.java8.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionImplementation {

    public static void main(String args[]) 
    { 
        // BiFunction which finds the sum of 2 integers 
        // and returns twice their sum 
    	//BiFunction<U, T,R>  U/T can be any object input type and R is return type
        BiFunction<Integer, Integer,Integer> composite = (a, b) -> a + b; 
  
        try { 
            // Using addThen() method 
            composite = composite.andThen(null); 
  
            // Printing the result 
            System.out.println("Composite = " + composite.apply(2, 3)); 
        } 
        catch (Exception e) { 
            System.out.println("Exception: " + e); 
        } 
    } 
} 