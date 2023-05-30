package com.santhosh._01_flow_of_program;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.println("Enter a value to be added : ");
            String a = in.next();
            if (a.charAt(0) == 'x' || a.charAt(0) == 'X'){
                break;
            }
            ans += Integer.parseInt(a);
        }
        System.out.println(ans);
    }
}
