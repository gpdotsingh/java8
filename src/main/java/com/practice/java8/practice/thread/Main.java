package com.practice.java8.practice.thread;

public class Main {

    public static void main(String[] args) {
        final Scientist s1 = new Scientist("Charles");
        final Scientist s2 = new Scientist("Pier");
        final Scientist s3 = new Scientist("Bob");
        final Scientist s4 = new Scientist("Ivan");

        final Spoon s = new Spoon(s1);


        new Thread(()-> s1.eat(s,s2)).start();
        new Thread(()-> s2.eat(s,s3)).start();
        new Thread(()-> s3.eat(s,s4)).start();
        new Thread(()-> s4.eat(s,s1)).start();
    }
}
