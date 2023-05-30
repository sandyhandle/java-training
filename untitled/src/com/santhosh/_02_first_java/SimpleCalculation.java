package com.santhosh._02_first_java;

import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value of 'A' : ");
        double a = in.nextDouble();
        System.out.print("Enter a value of 'B' : ");
        double b = in.nextDouble();

        System.out.print("Enter an operation (+,-,*,/) : ");
        String opp = in.next();
        char o = opp.charAt(0);
        if (o == '+'){
            System.out.println(a + b);
        } else if ( o =='-'){
            System.out.println(a - b);
        }else if ( o =='/'){
            if (b == 0){
                System.out.println("Denominator is zero\nTry again..");
            }else {
                System.out.println(a / b);
            }
        }else if ( o =='*'){
            System.out.println(a * b);
        }
    }
}
