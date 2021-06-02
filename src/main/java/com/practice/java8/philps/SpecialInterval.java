package com.practice.java8.philps;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class SpecialInterval {

    /***
     *
     *  This is input
     * 3
     * 1 2              1 2   (nonSpecialStart >= specialStart && nonSpecialStart <=  specialEnd)
     * 1 5              1 5   1 || 1 5  3
     * 1 7              1 7   1 || 1 7  3
     *
     * 3
     * 1 3 -- 3
     * 3 3 -- 2
     * 6 7 -- 1
     *
     * 4
     * 1 9
     * 4 8
     * 6 11
     * 7 9
     *
     * 2
     * 1 1
     * 4 10
     *
     *
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[][] special = new int[N][2];
        for(int i_special = 0; i_special < N; i_special++)
        {
            String[] arr_special = br.readLine().split(" ");
            for(int j_special = 0; j_special < arr_special.length; j_special++)
            {
                special[i_special][j_special] = Integer.parseInt(arr_special[j_special]);
            }
        }
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] non_special = new int[Q][2];
        for(int i_non_special = 0; i_non_special < Q; i_non_special++)
        {
            String[] arr_non_special = br.readLine().split(" ");
            for(int j_non_special = 0; j_non_special < arr_non_special.length; j_non_special++)
            {
                non_special[i_non_special][j_non_special] = Integer.parseInt(arr_non_special[j_non_special]);
            }
        }

        long[] out_ = Special_Interval(N, special, Q, non_special);
        System.out.print(out_[0]);
        for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
        {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static long[] Special_Interval(int N, int[][] special, int Q, int[][] non_special){

        long[] l = new long[Q];

        Arrays.asList(special)
                .stream()
                .forEach(ints -> {
                    System.out.println(ints[0]+"    "+ints[1]);
                });
        //     * 1 2              1 2   (nonSpecialStart >= specialStart && nonSpecialStart <=  specialEnd)

        for(int i=0; i< Q; i++)
        {
            int couter = 0;
            int start = non_special[i][0];
            int end = non_special[i][1];

            for(int j =0 ; j< N ; j++)
            {
                int startSpecial = special[j][0];
                int endSpecial = special[j][1];
                // if start falls between startSpecial and endSpecial
                if( start >= startSpecial &&  start <= endSpecial ){
                    couter++;
                }
                else if( end >= startSpecial   &&  end <= endSpecial )
                {
                    couter++;
                }
            }
            l[i] = couter;
        }

        return l;
    }
}