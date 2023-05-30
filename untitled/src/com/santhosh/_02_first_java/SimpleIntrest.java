package com.santhosh._02_first_java;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your principal : ");
        double p = in.nextDouble();
        System.out.print("Enter your time : ");
        double t = in.nextDouble();
        System.out.print("Enter your rate : ");
        double r = in.nextDouble();

        double si = (p * t * r) / 100;
        System.out.println("Simple Interest is " + si);
    }
}
