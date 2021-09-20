/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        /*
            Create a program that prompts for your weight, gender, total alcohol consumed (oz),
            and the amount of time since your last drink.
            Calculate your blood alcohol content (BAC) using this formula

            BAC = (A × 5.14 / W × r) − .015 × H
                where
                    - A is total alcohol consumed, in ounces (oz).
                    - W is body weight in pounds.
                    - r is the alcohol distribution ratio:

                    - 0.73 for men
                    - 0.66 for women
                    - H is number of hours since the last drink.

            Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int genderVal = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int alcConsumed = sc.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int weight = sc.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int elapsedTime = sc.nextInt();

        double bac = calcBAC(genderVal, alcConsumed, weight, elapsedTime);

        System.out.printf("Your BAC is %f%n", bac);
        legalBAC(bac);
    }
    public static double calcBAC(int gender, int a, int w, int h) {
        double r;
        if (gender == 1)  {
            r = 0.73;
            return (a*5.14 / w * r) - 0.015 * h;
        }
        if (gender == 2) {
            r = 0.66;
            return (a*5.14 / w * r) - 0.015 * h;
        }
        else {
            System.out.println("Remember to enter a 1 if you are male or a 2 if you are female. Try again.");
        }
        return 0;
    }
    public static void legalBAC(double bac) {
        if(bac>0.0) {
            if(bac > 0.08) {
                System.out.println("It is not legal for you to drive.");
            }
            else {
                System.out.println("It is legal for you to drive.");
            }
        }
    }
}
