/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution12 {
    public static void main(String[] args) {
        /* pseudocode:
            create class BankAccount with instance variables:
                double principleAmt
                double interestRate
                int duration
            gather possible values for above variables through input and flow control
            create method within BankAccount to calculate investment worth
            return investment worth
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principleAmt = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int duration = sc.nextInt();
        double investment = rounder(BankAccount.getInvestment(principleAmt, interestRate, duration));

        //BankAccount myAccount = new BankAccount(principleAmt, interestRate, duration);
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.%n",
                duration, interestRate, investment);
    }
    public static double rounder(double num) {
        num = Math.ceil(num*100.0) / 100.0;
        return num;
    }
}
