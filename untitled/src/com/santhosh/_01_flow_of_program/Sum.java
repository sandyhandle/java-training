package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type two number to sum : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum : " + (a+b));
    }
}
