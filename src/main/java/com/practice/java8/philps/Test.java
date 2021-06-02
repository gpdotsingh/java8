package com.practice.java8.philps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_a = br.readLine().split(" ");
        int[] a = new int[N];
        for(int i_a = 0; i_a < arr_a.length; i_a++)
        {
            a[i_a] = Integer.parseInt(arr_a[i_a]);
        }

        int[] out_ = group_Sol(N, a);
        System.out.print(out_[0]);
        for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
        {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();

    }

    public static int[] group_Sol(int N, int[] a){

        int n = a.length; // size of array

        int[] finalArr = new int[a.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(a[i])) {

                int c = map.get(a[i]);
                map.replace(a[i], c + 1);
            }

            else
                map.put(a[i], 1);
        }

        //int index=0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {

            if (i.getValue() > 1) {
                // System.out.println(i.getKey() + " "
                //+ i.getValue());
                map1.put(i.getKey(),i.getValue());
                //index++;
            }

            else
                continue;


        }

        //ArrayList<Integer> sortedElements = new ArrayList<>();

        //Java 8 code to sort elementCountMap by values in reverse order
        //and put keys into sortedElements list

        map1.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for(int i = 1; i <= entry.getValue(); i++)
                        map1.put(entry.getKey(),entry.getValue());
                });

        int index=0;
        for (Map.Entry<Integer, Integer> i :
                map1.entrySet()) {

            if (i.getValue() > 1) {
                finalArr[index]=i.getKey();
                index++;
            }

            else
                continue;


        }

        return Arrays.stream(finalArr).filter(num -> num != 0).toArray();
    }
}