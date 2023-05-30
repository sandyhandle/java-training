package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h = in.nextDouble();
        System.out.println("Enter the base : ");
        double b = in.nextDouble();
        double area = 0.5 * h * b;
        System.out.println("Area  = " + area);
    }

}
