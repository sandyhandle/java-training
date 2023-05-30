package com.santhosh._02_first_java;

import java.util.Scanner;

public class AmstrongNumber {
    public static boolean amstrong(int num){
        int temp = num;

        int digit = 0;
        while (temp > 0){
            temp /= 10;
            digit++;
        }

        temp = num;
        int ans = 0;
        while (temp > 0){

            ans = (int) (ans + Math.pow(temp%10,digit));
            temp /= 10;

        }
//        System.out.println(digit + ", " + num+", " + ans);
        if (num == ans){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
//        amstrong(153);
//        amstrong(8208);
//        amstrong(9474);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start : ");
        int start = in.nextInt();
        System.out.println("Enter the End : ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++){
            if (amstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
