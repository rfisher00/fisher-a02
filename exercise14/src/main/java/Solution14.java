/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        /* pseudocode:
            initialize str WI and double tax to 0
            prompt for orderAmt & state
            if state == WI
                tax = 0.055
                print subtotal/tax
            print total
        */
        Scanner sc = new Scanner(System.in);

        String exempt = "WI";
        double tax = 0.00;
        System.out.print("What is the order amount? ");
        double payment = sc.nextDouble();
        System.out.print("What is the state? ");
        String name = sc.next();

        if(exempt.equals(name)) {
            tax = 0.055;
            System.out.printf("The subtotal is $%.2f.%n", payment);
            System.out.printf("The tax is $%.2f.%n", payment*tax);
        }
        System.out.printf("The total is $%.2f.", payment + payment*tax);
    }
}