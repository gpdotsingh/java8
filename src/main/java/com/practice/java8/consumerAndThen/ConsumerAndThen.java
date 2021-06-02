package com.practice.java8.consumerAndThen;

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 
import java.util.function.Consumer; 
  
public class ConsumerAndThen { 
    public static void main(String args[]) 
    { 
  
        // Consumer to multiply 2 to every integer of a list 
        Consumer<List<Integer> > modify = list -> 
        { 
            for (int i = 0; i < list.size(); i++) 
                list.set(i, 5 * list.get(i));
        };
        
        Consumer<List<Integer> > square = list ->
        { 
            for (int i = 0; i < list.size(); i++)
            	list
                        .set(i,(int) Math.pow(list.get(i), 2));
        };
  
        // Consumer to display a list of integers 
        Consumer<List<Integer> > 
            dispList = list ->
                list.stream().
                        forEach(a -> System.out.print(a + " "));
  
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(2); 
        list.add(1); 
        list.add(3); 
  
        // using addThen() 
        modify
                .andThen(square)
                .andThen(dispList)
                .accept(list);
    } 
} 