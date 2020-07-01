package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class LoopsTwo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int temp = 0;
            String s = "";
            for(int j = 0; j< n; j++){
                temp = (int)Math.pow(2, j)*b + temp;
                s = s.concat(String.format("%d ", a + temp));
            }
            System.out.println(s);
        }
        in.close();
    }
}

//    String s = "Strings are immutable";
//      s = s.concat(" all the time");

//    int result=0;
//for(int k=0;k<n;k++){
//        result=(int)Math.pow(2,k)*b + result;
//        System.out.print(a+result+" ");
//        }
//        System.out.println();

