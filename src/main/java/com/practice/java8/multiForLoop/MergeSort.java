package com.practice.java8.multiForLoop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {



        // Complete the countInversions function below.
        // Complete the countInversions function below.

        static int counter = 0;
        static long countInversions(int[] arr) {
            counter = 0;
            mergeAndSort(arr);

            return counter;

        }

        public static int[] mergeAndSort(int[] arr)
        {
            if(arr.length <= 1 )
                return arr;

            int [] arrLeft = Arrays.copyOfRange(arr,0,arr.length/2);
            int [] arrRight = Arrays.copyOfRange(arr,arr.length/2,arr.length);

            arrLeft  = mergeAndSort(arrLeft);
            arrRight = mergeAndSort(arrRight);

            return sortAndMerge(arrLeft,arrRight);

        }

        public static int[] sortAndMerge(int [] arrLeft, int [] arrRight)
        {
            int[] ttlArray = new int[arrLeft.length + arrRight.length ] ;

            int leftArrPointer = 0;
            int rightArrPointer = 0;

            for (int i = 0; i < ttlArray.length ; i++)
            {

                if(
                        arrLeft[leftArrPointer] <= arrRight[rightArrPointer]
                )
                {
                    ttlArray[i] = arrLeft[leftArrPointer];
                    if(leftArrPointer < (arrLeft.length -1))
                        leftArrPointer++;
                }
                else{
                    ttlArray[i] =  arrRight[rightArrPointer];
                    if(rightArrPointer < (arrRight.length -1))
                        rightArrPointer++;
                    counter ++;
                }
            }

            printArray(ttlArray);
            return ttlArray;
        }


        public static void printArray(int[] arr)
        {

            Arrays.stream(arr)
                    .forEach(i->{
                        System.out.print(i);
                    });

            System.out.println();
        }




        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] arr = new int[n];

                String[] arrItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {
                    int arrItem = Integer.parseInt(arrItems[i]);
                    arr[i] = arrItem;
                }

                long result = countInversions(arr);


            }


            scanner.close();
        }
    }
