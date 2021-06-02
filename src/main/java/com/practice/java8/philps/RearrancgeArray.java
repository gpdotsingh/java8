package com.practice.java8.philps;


import java.io.*;
import java.util.*;



public class RearrancgeArray  {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i=0; t_i<T; t_i++) {
                int N = Integer.parseInt(br.readLine().trim());
                int[] A = new int[N];
                String[] arr_A = br.readLine().split(" ");
                for(int i_A = 0; i_A < N; i_A++) {
                    A[i_A] = Integer.parseInt(arr_A[i_A]);
                }

                String out_ = Solve(N, A);
                System.out.println(out_);
            }

            wr.close();
            br.close();
        }
        static String Solve(int N, int[] A){
            Map<Integer,Integer> map = new LinkedHashMap();
            for(int i=0; i<N; i++)
            {
                if(map.containsKey(A[i]))
                    map.replace(A[i],(map.get(A[i])+1));
                else{
                    map.put(A[i],1);
                }
            }
            boolean b = map.values()
                    .stream()
                    .anyMatch(o->o%2!=0);

            if(b)
                return "NO";
            else{
                return "YES";

            }

        }
    }