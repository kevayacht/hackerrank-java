package com.company;

import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        java_output_formatting();
    }

    public static void java_output_formatting() {
        // The inputs for string formatting are below:
        // java 100
        // cpp 65
        // python 50

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-14s %03d", s1, x));
        }
        System.out.println("================================");
    }
}
