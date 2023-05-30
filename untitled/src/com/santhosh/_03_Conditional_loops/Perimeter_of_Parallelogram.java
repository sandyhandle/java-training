package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_Parallelogram {
    public static void main(String[] args) {
        System.out.println(" Perimeter of Parallelograms! ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h = in.nextDouble();
        System.out.println("Enter the width : ");
        double w = in.nextDouble();
        double area = h + h + w + w ;
        System.out.println("Area  = " + area);
    }

}
