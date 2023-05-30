package com.santhosh._02_first_java;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an INR value to convert it into USD : ");
        double inr = in.nextDouble();
        System.out.println(inr * 0.012082);

    }
}
