/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        /*
            pseudocode:
            prompt for price and qty of 3 items
            add the products of each for subtotal
            return subtotal * tax and add for total
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        float price1 = sc.nextFloat();
        System.out.print("Enter the quantity of item 1: ");
        int qty1 = sc.nextInt();

        System.out.print("Enter the price of item 2: ");
        float price2 = sc.nextFloat();
        System.out.print("Enter the quantity of item 2: ");
        int qty2 = sc.nextInt();

        System.out.print("Enter the price of item 3: ");
        float price3 = sc.nextFloat();
        System.out.print("Enter the quantity of item 3: ");
        int qty3 = sc.nextInt();

        double subtotal = calcSubtotal(price1, qty1, price2, qty2, price3, qty3);

        System.out.printf("Subtotal: $%.2f%n", subtotal);

        final float tax = (float) 0.055;
        System.out.printf("Tax: $%.2f%n", tax*subtotal);
        System.out.printf("Total: $%.2f%n", tax*subtotal + subtotal);
    }
    public static double calcSubtotal(float p1, int q1, float p2, int q2, float p3, int q3) {
        return p1*q1+p2*q2+p3*q3;
    }
}