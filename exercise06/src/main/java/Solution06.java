/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 06
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution06 {
    public static void main(String[] args) {
        /*
            implement input necessities
            prompt for age and retireAge
            wait for input then parse to Int
            calculate the difference
            use calendar instance to obtain current year

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);

        System.out.print("At what age would you like to retire? ");
        String retireStr = sc.nextLine();
        int retireAge = Integer.parseInt(retireStr);

        int ageDiff = retireAge - age;

        System.out.printf("You have %d years left until you can retire%n", ageDiff);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currYear = calendar.get(Calendar.YEAR);

        System.out.printf("It's %d, so you can retire in %d", currYear, currYear + ageDiff);
    }
}