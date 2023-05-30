package com.santhosh._03_Conditional_loops.Intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = in.nextLine();

        String ans = "";

        for (int i = word.length() - 1; i  >=0; i--){
            ans += word.charAt(i);
        }
        System.out.println(ans);
    }
}
