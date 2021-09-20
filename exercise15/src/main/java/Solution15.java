/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        /*pseudocode:
            implement input necessities
            initialize password string
            prompt for the password
            if password.equals(input)
                print Welcome!
            else
                print I don't know you
         */

        Scanner sc = new Scanner(System.in);
        String password = "abc$123";
        System.out.print("What is the password? ");
        String inputPW = sc.nextLine();
        if(password.equals(inputPW)) {
            System.out.println("Welcome!");
        }
        else
            System.out.println("I don't know you.");
    }
}
