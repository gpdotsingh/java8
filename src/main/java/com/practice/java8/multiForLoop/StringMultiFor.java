package com.practice.java8.multiForLoop;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StringMultiFor {

    public static void main(String[] args) {
        String s = "l";

        char[] c= s.toCharArray();
        AtomicInteger count = new AtomicInteger();


        IntStream.range(0,c.length+1)
                .forEach( n->{
                    System.out.println("n for "+n);
                    IntStream.range(0,n)
                            .forEach(sub ->
                            {

                                System.out.println(s.substring(sub,n)+"   "+n+"   "+sub);
                                StringBuffer sb = new StringBuffer();
                               // sb.append(s.substring(sub,n));
                                sb.append(s.substring(sub,n));
                                if(sb.length()>1
                                && sb.toString().equals(sb.reverse().toString()))
                                    count.getAndIncrement();

                            });
                });
    }
}
