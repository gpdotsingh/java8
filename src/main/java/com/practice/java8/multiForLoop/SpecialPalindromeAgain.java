package com.practice.java8.multiForLoop;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SpecialPalindromeAgain {
    static char [] palindromToArray;
    public static void main(String[] args) {

        String s ="aaaa";


        int n = s.length();
        if( n > 1)
        {
            palindromToArray = s.toCharArray();
            AtomicInteger count = new AtomicInteger();
            IntStream.range(0,s.length())
                    .forEach( len -> {

                        int countFromPalindrom =0;

                        if( (len+1 < s.length() ) && palindromToArray[len] == palindromToArray[len+1])
                        {
                            countFromPalindrom = chekSpecialPalindrom(len, len + 1);
                            count.set(count.get() + countFromPalindrom);
                            System.out.println(" Case 1 "+ palindromToArray[len] +":::::"+ palindromToArray[len+1]+                          "   count :: "+countFromPalindrom);

                        }
                        else if((len+2 < s.length() )
                                && palindromToArray[len] != palindromToArray[len+1]
                                && palindromToArray[len] == palindromToArray[len+2]){

                            countFromPalindrom = chekSpecialPalindrom(len, len + 2);
                            count.set(count.get() + countFromPalindrom);
                            System.out.println(" Case 2 "+ palindromToArray[len] +":::::"+  palindromToArray[len+2]+                          "   count :: "+countFromPalindrom);

                        }
                    });
            n = count.get() + n;
        }

    }

    private static int chekSpecialPalindrom(int len1, int len2)
    {
        int count = 0;
        for(int k=0;k<palindromToArray.length /2;k++)
        {
            if((len1 - k) >= 0
                    && (len2 + k) < palindromToArray.length
                    && palindromToArray[len1 - k] == palindromToArray[len2 + k])
                count++;
            else {
                break;
            }
        }

        long sum = IntStream.range(0, palindromToArray.length / 2)
                .filter(n -> {
                    if ((len1 - n) > 0)
                        return true;
                    else
                        return false;
                })
                .filter(n -> {

                    if ((len2 + n) < palindromToArray.length)
                        return true;
                    else
                        return false;
                })
                .mapToLong(value ->

                        value)
                .sum();

        return (int) sum;
    }
}
