package com.santhosh._03_Conditional_loops.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = in.nextInt();
        long ans = 1;
        for (int i = 2; i <= n; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}
