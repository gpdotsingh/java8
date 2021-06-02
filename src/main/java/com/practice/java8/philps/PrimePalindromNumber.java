package com.practice.java8.philps;

import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimePalindromNumber {


    // If the any number which is palindrom and prime number
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                String[] line = br.readLine().split(" ");
                int L = Integer.parseInt(line[0]);
                int R = Integer.parseInt(line[1]);

                int out_ = palPrime(L, R);
                System.out.println(out_);

            }

            wr.close();
            br.close();
        }
        static int palPrime(int L, int R){
            // Write your code here

            long count = Stream.iterate(0, n -> n + 1)
                    .filter(PrimePalindromNumber::isPrime)
                    .peek(x -> System.out.format("%s\t", x))
                    .count();

            System.out.println("\nTotal: " + count);
            return 0;
        }

    public static boolean isPrime(int number) {

        if (number <= 1) return false; // 1 is not prime and also not composite

        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
    }