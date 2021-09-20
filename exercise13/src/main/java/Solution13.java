/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution13 {
    public static void main(String[] args) {
        /* pseudocode:
            create class BankAccount with instance variables:
                double principleAmt
                double interestRate
                int duration
                int numCompounded
            gather values for above variables through input
            create method within BankAccount to calculate investment worth
            use math.pow() method to calculate the power
            return investment worth
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principleAmt = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int duration = sc.nextInt();
        System.out. print("What is the number of times the interest is compounded per year? ");
        int numCompounded = sc.nextInt();


        BankAccount myAccount = new BankAccount(principleAmt, interestRate, duration, numCompounded);
        double investment = myAccount.getInvestment(principleAmt, interestRate, duration, numCompounded);

        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.%n",
                principleAmt, interestRate, duration, numCompounded, rounder(investment));
    }
    public static double rounder(double num) {
        num = Math.ceil(num*100.0) / 100.0;
        return num;
    }
}