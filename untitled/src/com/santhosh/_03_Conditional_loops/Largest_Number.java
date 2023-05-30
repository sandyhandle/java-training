package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        System.out.println("Enter 0 to exit ");
        Scanner in = new Scanner(System.in);
        int max = 0;

        while (true){
            int a = in.nextInt();
            if (a == 0){
                break;
            } else if (a > max){
                max = a;
            }


        }

        System.out.println(max);
    }

}
