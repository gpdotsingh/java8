package com.practice.java8.hackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CloudJump {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        Arrays.stream(c)
                .reduce(0,(a,b)->
                {
                   System.out.println("a::::"+a+"   b::::"+b);
                    if(a==1)
                        return 1;
                    else
                        return 0;
                });

        int jump =0;
        // 0 0 0 1 0 0
        for(int i=0; i < c.length; i++)
        {
            int currEle = c[i];
            int nextEle = 8;
            if(i < c.length -2)
                nextEle = c[i+2];

            if(nextEle == 0)
            {
                i++;
            }
            if(i<(c.length-1))
                jump ++;
        }
        System.out.println(":::"+jump);
        return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        scanner.close();
    }
}
