package com.santhosh._03_Conditional_loops;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Factorial finder; ");
        System.out.print("Enter a no : ");
        int n = in.nextInt();

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
