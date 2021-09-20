/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {

        /*
            pseudocode:
            implement input necessities
            prompt and scan for monthNum
            switch case of 13 for each month & invalid input
            print month name or error msg
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month = sc.nextInt();

        String monthStr = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid number";
        };
        System.out.printf("The name of the month is %s", monthStr);
    }
}
