package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Volume_of_Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Volume of the Cone");
        System.out.print("Enter Height : ");
        double h = in.nextDouble();
        System.out.print("Enter radius : ");
        double r = in.nextDouble();

        double volume = (1.0/3.0) * Math.PI * r * r * h;
        System.out.println("Volume : " + volume);
    }
}
