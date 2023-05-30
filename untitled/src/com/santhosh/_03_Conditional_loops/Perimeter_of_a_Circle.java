package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_a_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the diameter : ");
        double d = in.nextDouble();
        double area = Math.PI * d;
        System.out.println("Area  = " + area);
    }

}
