/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        /* pseudocode:
            prompt for 3 separate ints
            use func maxInt() and set first int as max
                if duplicates:
                    System exit
                if second int > max
                    max = second int
                if third int > max
                    max = third int
             print out max
         */
        int first, second, third;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first = sc.nextInt();
        System.out.print("Enter the second number: ");
        second = sc.nextInt();
        System.out.print("Enter the third number: ");
        third = sc.nextInt();

        maxInt(first,second,third);
    }
    public static void maxInt(int x, int y, int z) {
        int max = x;
        if(x == y || y == z || z == x) {
            System.exit(0);
        }
        if(y>max) {
            max = y;
        }
        if(z>max) {
            max = z;
        }
        System.out.printf("The largest number is %d.%n", max);
    }
}