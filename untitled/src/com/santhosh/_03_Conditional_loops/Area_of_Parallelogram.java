package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Parallelogram {
    public static void main(String[] args) {
        System.out.println(" Area of Parallelograms! ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h = in.nextDouble();
        System.out.println("Enter the Base : ");
        double b = in.nextDouble();
        double area = h * b;
        System.out.println("Area  = " + area);
    }

}
