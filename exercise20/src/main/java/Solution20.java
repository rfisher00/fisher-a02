/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {

        /*
            implement input necessities
            prompt for orderAmt & state

            have func checkTax() check:
            if state is Wisconsin
                add %5 tax and ask for county
                if county is Eau Claire
                    add %5 tax
                if county is Dunn
                    add %4 tax
            if state is Illinois
                add %8 tax
            else
                the tax is 0
            add taxes to total in main & print
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        float charge = sc.nextFloat();
        System.out.print("What state do you live in? ");
        String state = sc.next();

        float total = charge + rounder(checkTax(charge, state));
        System.out.printf("The total is $%.2f.%n", total);
    }
    public static float rounder(float num) {
        num = (float) Math.ceil(num*100.0f) / 100.0f;
        return num;
    }

    public static float checkTax(float num, String state) {
        Scanner sc = new Scanner(System.in);
        float tax;
        if(state.equals("Wisconsin")) {
            tax = num*0.05f;
            System.out.print("What county do you live in? ");
            String county = sc.nextLine();
            if(county.equals("Eau Claire"))
                tax += num*0.05f;
            if(county.equals("Dunn"))
                tax += num*0.04f;

            System.out.printf("The tax is $%.2f.%n", tax);

            return tax;

        }
        if(state.equals("Illinois")) {
            tax = num*0.08f;
            System.out.printf("The tax is $%.2f.%n", tax);
            return tax;
        }
        else {
            tax = 0;
        }
        return tax;
    }
}
