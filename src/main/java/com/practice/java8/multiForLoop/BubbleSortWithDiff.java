package com.practice.java8.multiForLoop;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class BubbleSortWithDiff {
    public static void main(String[] args) {
        Integer [] arr = {2, 1, 3, 1, 2};
        bubbleSort(arr);
        System.out.println(arr);

    }

    static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        AtomicInteger count = new AtomicInteger();
        IntStream.range(0, n - 1)
                .forEach(
                        i->{
                            IntStream.range(1,n-i)
                                    .forEach(j ->{
                                        if (arr[j - 1] > arr[j]) {
                                            int temp = arr[j];
                                            arr[j] = arr[j - 1];
                                            arr[j - 1] = temp;
                                            count.getAndIncrement();
                                        }
                                    });
                        }
                );
        System.out.println(count.get());
    }
}
