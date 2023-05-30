package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Volume of the Pyramid");
        System.out.print("Enter Height : ");
        double h = in.nextDouble();
        System.out.print("Enter length : ");
        double l = in.nextDouble();
        System.out.print("Enter width : ");
        double w = in.nextDouble();


        double volume =  (1.0/3.0) * l * w * h;
        System.out.println("Volume : " + volume);
    }
}
