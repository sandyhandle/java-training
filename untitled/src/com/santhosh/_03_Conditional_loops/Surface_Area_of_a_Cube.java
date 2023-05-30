package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Surface_Area_of_a_Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Surface Area of a Cube");
        System.out.print("Enter length : ");
        double l = in.nextDouble();

        double area =  l * l * 6 ;
        System.out.println("Surface Area of a Cuber : " + area);
    }
}
