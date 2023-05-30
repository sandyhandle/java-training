package com.santhosh._02_first_java;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }
    }
}
