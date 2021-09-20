/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        /*
            pseudocode:
            prompt for input C or F
            if F or f or c or F
                continue: output choice
                call convTemp to calc and print converted temo
            else
                input the correct character
         */
        Scanner sc = new Scanner(System.in);
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%n" +
                "Press F to convert from Celsius to Fahrenheit.%n");
        String temp = sc.nextLine();
        if(temp.equals("f")||temp.equals("F")||temp.equals("c")||temp.equals("C")) {
            System.out.printf("Your choice: %s%n", temp);
            convTemp(temp);
        }
        else
            System.out.println("Input the correct character");
    }
    public static void convTemp(String choice) {
        Scanner sc = new Scanner(System.in);

        if(choice.equals("C")||choice.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = sc.nextInt();
            temp = (int) ((temp - 32) * 5.0 / 9.0);
            System.out.printf("The temperature in Celsius is %d%n", temp);
        }
        if(choice.equals("f")||choice.equals("F")) {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = sc.nextInt();
            temp = (int) (temp * 5.0 / 9.0) + 32;
            System.out.printf("The temperature in Fahrenheit is %d%n", temp);
        }
    }
}
