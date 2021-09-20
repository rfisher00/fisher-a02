/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your weight (lbs)? ");
        float weight = sc.nextFloat();
        System.out.print("What is your height (in)? ");
        float height = sc.nextFloat();

        calcBMI(weight, height);
    }
    public static void calcBMI(float w, float h) {
        float bmi = ((w / (h*h))*703);
        if(bmi < 18.5)
            System.out.printf("Your BMI is %.2f%nYou are underweight. You should see your doctor.", bmi);
        if(bmi > 25)
            System.out.printf("Your BMI is %.2f%nYou are overweight. You should see your doctor.", bmi);
        else
            System.out.println("You are within the ideal weight range");
    }
}
