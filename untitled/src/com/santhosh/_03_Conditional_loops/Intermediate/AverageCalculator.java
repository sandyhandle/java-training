package com.santhosh._03_Conditional_loops.Intermediate;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        double average = sum/n;
        System.out.println("Average : " + average );
    }
}
