package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter 0 to exit ");
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true){
            int a = in.nextInt();
            if (a == 0){
                break;
            }
            sum += a;
        }

        System.out.println(sum);
    }

}
