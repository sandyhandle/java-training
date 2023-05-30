package com.santhosh._02_first_java;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String word){
        int left = 0;
        int right = word.length() -1;
        while (left < right){
            if (word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = in.next();

        if (palindrome(word)){
            System.out.println("The given word ("  + word + ") is a Palindrome." );
        } else {
            System.out.println("The given word ("  + word + ") is not a Palindrome." );
        }
    }
}
