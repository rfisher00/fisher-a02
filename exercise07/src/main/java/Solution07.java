/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        /* pseudocode:
            implement input necessities
            prompt for length & width & parse to float/int
            return input with calculated area & converted area
         */

        Scanner sc = new Scanner(System.in);
        //

        System.out.print("What is the length of the room in feet? ");
        String lenStr = sc.nextLine();
        double ftLen = Float.parseFloat(lenStr);
        System.out.print("What is the width of the room in feet? ");
        String widthStr = sc.nextLine();
        double ftWidth = Float.parseFloat(widthStr);

        System.out.printf("You entered dimensions of %d feet by %d feet%n", (int) ftLen, (int) ftWidth);
        double area = ftLen * ftWidth;
        System.out.printf("The area is %n%d square feet%n%.2f square meters", (int) area, areaConv(area));
    }
    public static double areaConv(double area) {
        final double convert = 0.09290304;

        return area * convert;
    }
}
