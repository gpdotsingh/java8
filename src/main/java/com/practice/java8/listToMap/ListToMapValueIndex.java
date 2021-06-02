package com.practice.java8.listToMap;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ListToMapValueIndex {

    public static void main(String[] args) {
        int[] k = {1,5,2};
        countInversions(k);
        AtomicInteger index = new AtomicInteger(0);
        Map keyWithIndex = new LinkedHashMap();

        Arrays
                .asList(k)
                .forEach(i->{
                    keyWithIndex
                            .put(i,index.getAndIncrement());
                });

//        Arrays.asList(k)
//                .stream()
//        .collect(Collectors.groupingBy(Function.identity(),index.getAndIncrement()));

        System.out.println(keyWithIndex);

        List<Integer> numbers = Arrays.asList(1, 3, 2);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .collect(toList());
        System.out.println(twoEvenSquares);
    }


    // Complete the countInversions function below.
    static long countInversions(int[] arr) {


        if(arr.length<=1)
            return 0;

        int[] arrLeft     = new int[arr.length/2] ;
        int[] arrRight    = new int[arr.length - arr.length/2] ;

        arrLeft = Arrays.copyOfRange(arr,0,arr.length/2);
        arrRight = Arrays.copyOfRange(arr,arr.length/2,arr.length);


        // Break them till it is single
        countInversions(arrLeft);
        countInversions(arrRight);

        int[] ints = sortAndMergeArray(arrLeft, arrRight);
        arrLeft = Arrays.copyOfRange(ints,0,ints.length/2);
        arrRight = Arrays.copyOfRange(ints,ints.length/2,ints.length);
        return 4;

    }

    static int[] sortAndMergeArray(int[] arrLeft,int[] arrRight)
    {
        int[] mergedArray = new int[arrLeft.length + arrRight.length];

        int leftCounter = 0;
        int rightCounter = 0;
        for(int i=0; i<(arrLeft.length+ arrRight.length); i++)
        {
            if(leftCounter <arrLeft.length
                    && (rightCounter == arrRight.length || (arrLeft[leftCounter] < arrRight[rightCounter])))
            {
                mergedArray[i] = arrLeft[leftCounter];
                leftCounter ++;
            }
            else{
                mergedArray[i] = arrRight[rightCounter];
                rightCounter ++;
            }
        }


        return mergedArray;
    }





}
