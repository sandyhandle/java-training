package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h = in.nextDouble();
        System.out.println("Enter the side length : ");
        double s = in.nextDouble();


        double area = h * s;



        System.out.println("Area 1 = " + area);
    }

}
