package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class LCM {

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static int lcm(int a, int b){
        return (a*b)/ gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 values to  find the LCM : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }
}
