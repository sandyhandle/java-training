package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two sides length : ");
        double a = in.nextDouble();
        System.out.println("Enter the one side length : ");
        double b = in.nextDouble();
        double c = a;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the Isosceles Triangle  = " + area);
    }

}
