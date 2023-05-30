package com.santhosh._02_first_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);

        System.out.println("Enter a number to get the Fibonacci Series : ");
        int n = io.nextInt();

        if (n == 1){
            System.out.println(0);
            return;
        }
        long a = 0;
        long b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n;i++){
            long temp = b ;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
        }

    }
}
