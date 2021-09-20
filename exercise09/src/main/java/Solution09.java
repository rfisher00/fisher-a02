/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 9
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution09 {
    public static void main(String[] args) {
        /* pseudocode:
            prompt for length & width, parse to float
            initialize area as their product
            use area in func paintAmt to find paint needed
            use modulo to round to next gallon
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String lenStr = sc.nextLine();
        float ftLen = Float.parseFloat(lenStr);
        System.out.print("What is the width of the room in feet? ");
        String widthStr = sc.nextLine();
        float ftWidth = Float.parseFloat(widthStr);

        float area = ftLen*ftWidth;

        System.out.printf("You will need to purchase %.2f gallons of paint to cover %f square feet.", paintAmt(area), area);
    }
    public static double paintAmt(double area) {
        double gallons = area/350;
        if(gallons%1 != 0) {
            gallons = (gallons - (gallons%1) +1);
        }
        return gallons;
    }
}
