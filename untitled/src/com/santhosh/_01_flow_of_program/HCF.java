package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 values to  find the Highest Common Factor : ");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 1; i <= a || i <= b; i++){
            if (a % i ==0 && b % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
