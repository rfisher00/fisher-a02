/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution16 {
    /* pseudocode:
        initialize input necessities
        prompt for user age
        ternary operate age => 16 ?
            true: can drive
            false: can't drive
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = sc.nextInt();
        System.out.println(age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
