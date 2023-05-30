package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the tables : ");
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++){
            int m = i * n;
            System.out.println(i + " * " + n + " = " + m);
        }
    }


}
