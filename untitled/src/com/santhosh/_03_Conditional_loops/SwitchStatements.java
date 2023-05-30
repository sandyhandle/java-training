package com.santhosh._03_Conditional_loops;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.nextLine();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King fruit");
//            case "grapes" -> System.out.println("Wine fruit");
//            default -> System.out.println("enter a fruit");
//        }
        int day = in.nextInt();

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Working day");
            case 6, 7 -> System.out.println("Weekend");
        }
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
