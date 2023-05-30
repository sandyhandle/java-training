package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h = in.nextDouble();
        System.out.println("Enter the width : ");
        double w = in.nextDouble();
        double area = h * w;
        System.out.println("Area  = " + area);
    }

}
