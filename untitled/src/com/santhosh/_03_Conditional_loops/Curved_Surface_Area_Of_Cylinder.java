package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Curved Surface Area Of Cylinder");
        System.out.print("Enter Height : ");
        double h = in.nextDouble();
        System.out.print("Enter radius : ");
        double r = in.nextDouble();


        double area =  2 * Math.PI * r * h ;
        System.out.println("Curved Surface Area Of Cylinder : " + area);
    }
}
