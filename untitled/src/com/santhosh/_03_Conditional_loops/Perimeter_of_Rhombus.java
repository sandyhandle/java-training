package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class Perimeter_of_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Perimeter of the Rhombus");
        System.out.println("Enter the length of the Rhombus : ");
        double l = in.nextDouble();
        double perimeter = 4 * l;
        System.out.println("Perimeter of a Rhombus: " + perimeter);


    }
}
