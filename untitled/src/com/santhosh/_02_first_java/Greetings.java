package com.santhosh._02_first_java;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String name_1 = in.next();
        System.out.print("Enter your second name : ");
        String name_2 = in.next();

        System.out.println("Hello " + name_1 + " " + name_2 + ".");
    }
}
