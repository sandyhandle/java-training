package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double r = in.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area  = " + area);
    }

}
