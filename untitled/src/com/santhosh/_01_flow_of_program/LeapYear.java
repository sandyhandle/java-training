package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args)  {
        int i = 0;
        while (i < 10) {
            Scanner in = new Scanner(System.in);

            int year = in.nextInt();


            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0){
                        System.out.println("it's a leap year");
                    }else {
                        System.out.println("it's not a leap year");
                    }
                } else {
                    System.out.println("it's a leap year");
                }
            } else {
                System.out.println("it's not a leap year");
            }

            i++;
        }
    }

}
