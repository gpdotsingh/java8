package com.practice.java8.hackerRank;


import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;

public class Valley {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

//        IntPredicate predicate = e->e % 11 == 0;
//        System.out.println(Arrays.stream(arr_sample2)
                //.anyMatch(predicate));
        IntPredicate predicate = e->{if(e=='U'); return true;};

        path.chars()
                .mapToObj(operand -> predicate)
        .forEach(intPredicate -> System.out.println(intPredicate));

        /**
         char[] ch = path.toCharArray();
         AtomicInteger valleyCount = new AtomicInteger(0);
         AtomicInteger count = new AtomicInteger(0);
         path.chars()                 // IntStream
         .mapToObj(p -> (char) p)
         .forEach(character -> {
         // Get the previous count
         int previousCount = count.get();
         //

         System.out.println(character);

         if(character == 'U') {
         count.getAndIncrement();
         }
         else {
         count.getAndDecrement();
         }

         if(previousCount < 0
         && count.get() >= 0)
         valleyCount.getAndIncrement();

         //     System.out.println("previous count"+ previousCount);
         //     System.out.println(" count"+ count.get());
         //     System.out.println("valleyCount count"+ valleyCount.get());
         // //    System.out.println("previous count"+ previousCount);


         });

         return valleyCount.get(); */

     int valley = 0;
     int down = 0;
     int up= 0;
     int totalCount = 0;
     final int seaLevel =0;
     int previous = 0;
     for(int i = 0 ; i< steps; i++)
     {
         previous = totalCount ;

         if(path.charAt(i) == 'U')
         {
             totalCount ++;
         }
         else
         {
             totalCount --;
         }

         if(previous < 0 && totalCount>=0)
             valley++;
     }
     return valley;
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Valley.countingValleys(steps, path);


        bufferedReader.close();
    }
}
