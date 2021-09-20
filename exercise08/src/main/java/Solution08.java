/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 8
 *  Copyright 2021 Ryan Fisher
 */

import java.util.*;

public class Solution08 {
    public static void main(String[] args) {
        /*
            pseudocode:
            implement input necessities
            prompt for how many people, pizzas, slices
            store as int
            calculate portions w int truncation
            calculate leftovers with modulo
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        int party = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = sc.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = sc.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)%n", party, pizzas, slices*pizzas);

        int portion = (slices*pizzas)/party;
        int leftover = slices%party;

        System.out.printf("Each person gets %d pieces of pizza.%n", portion);
        System.out.printf("There are %d leftover pieces.%n", leftover);
    }
}