package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length of the Sides : ");
        double s = in.nextDouble();
        double area = s * 3;
        System.out.println("Area  = " + area);
    }

}
