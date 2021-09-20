/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution11 {
    public static void main(String[] args) {

        /*
            pseudocode:
            prompt for how many euros & exchange rate
            initialize outputAmt as their product
            use func rounder() to get the nearest cent
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        float currFrom = sc.nextFloat();

        System.out.print("What is the exchange rate? ");
        float rate = sc.nextFloat();

        float currTo = currFrom * rate;

        System.out.printf("%.2f euros at an exchange rate of %.4f is%n%.2f U.S. dollars.", currFrom, rate, rounder(currTo));
    }
    public static double rounder(double num) {
        num = Math.ceil(num*100.0) / 100.0;
        return num;
    }
}