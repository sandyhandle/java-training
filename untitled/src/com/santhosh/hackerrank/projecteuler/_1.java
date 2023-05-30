package com.santhosh.hackerrank.projecteuler;

public class _1 {
    public static int problem1(int n) {
        int three = 0;
        int a1 = 3;
        int a2 = 0;
        for (int i = n-1; i > 0; i--){
            if (i%3 == 0){
                a2 = i;
                break;
            }
        }
        System.out.println(a1 + " - " + a2);
        int i1 = (a1 + a2) / 2;
        three += ((n-1)/3) * i1;

        System.out.println(three);

        int five = 0;
        a1 = 5;
        a2 = 0;
        for (int i = n-1; i > 0; i--){
            if (i%5 == 0){
                a2 = i;
                break;
            }
        }
        System.out.println(a1 + " - " + a2);
        i1  = (a1 + a2) / 2;
        five += ((n-1)/5) * i1;

        System.out.println(five);

        int fiftin = 0;
        a1 = 15;
        a2 = 0;
        for (int i = n-1; i > 0; i--){
            if (i%15 == 0){
                a2 = i;
                break;
            }
        }
        System.out.println(a1 + " - " + a2);
        i1 = (a1 + a2) / 2;

        fiftin += ((n-1)/15) * i1;

        System.out.println(fiftin);
        return three + five - fiftin;
        }
//        for (int i = 1; i < n; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//                sum += i;
//            }
//
//        }

    public static void finder(int n){
        int fiften = 0;
        for (int i = 1; i < n; i++){
            if (i % 3 ==0 && i % 5 ==0 ){
                System.out.println(i);
                fiften += i;
            }
        }
        int three = 0;
        for (int i = 1; i < n; i++){
            if (i % 3 ==0){
                three += i;
            }
        }
        int five = 0;
        for (int i = 1; i < n; i++){
            if (i % 5 ==0 ){
                five += i;
            }
        }
        System.out.println(three);
        System.out.println(five);
        System.out.println(fiften);
        System.out.println(three + five - fiften);
    }

    public static void main(String[] args) {
        System.out.println(problem1(100));
        System.out.println("**********");
        finder(100);


    }
}
