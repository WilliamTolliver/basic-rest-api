package com.example.wttech.basicrestapi;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SocksSalesman {

        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {

            //Declarations
            int pairs = 0;
            Set<Integer> socks = new HashSet();

            //Quick empty check
            if (ar.length == 0){return pairs;}

            // Check for pairs and remove them
            for(int i = 0; i<ar.length; i++){

                if(!socks.contains(ar[i])){
                    socks.add(ar[i]);
                }else {
                    pairs++;
                    socks.remove(i);
                }
            }
            return pairs;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

        }
}
