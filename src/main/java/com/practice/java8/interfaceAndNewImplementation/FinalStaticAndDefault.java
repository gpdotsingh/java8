package com.practice.java8.interfaceAndNewImplementation;

// An Interface that contains exactly one abstract method is known as functional interface.
// It can have any number of default, static methods but can contain only one abstract method.
// It can also declare methods of object class.

@FunctionalInterface
public interface FinalStaticAndDefault {

    default String defaultmethod(){
        return "Inside defaultmethod";
    }

    static String method1()
    {
        return "method1";
    }

    static String method2()
    {
        return "method2";
    }

    static String method3()
    {
        return "method3";
    }

     String method4();



}
