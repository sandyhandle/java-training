package com.santhosh._02_first_java;

import java.util.Scanner;

public class LargestNumberFrom2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value of 'A' : ");
        int a = in.nextInt();
        System.out.print("Enter a value of 'B' : ");
        int b = in.nextInt();

        if (a > b){
            System.out.println(a + " is greater than " + b);
        } else if (b > a){
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both the values are equal (" + a + ")");
        }
    }
}
