package com.santhosh._03_Conditional_loops.Intermediate;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int negative = 0;
        int positive = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            if (a < 0){
                negative += a;
            }  else if (a > 0){
                positive += a;
                if (a % 2 == 0){
                    even += a;
                } else {
                    odd += a;
                }
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
}
