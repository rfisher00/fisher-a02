/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Ryan Fisher
 */

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        /* pseudocode:
            if (the car silent when you turn the key?)

                if (the battery terminals corroded?)
                    Clean terminals and try starting again
                    stop
                else
                    Replace cables and try again
                    stop

            else
                if (the car make a slicking noise?)
                    Replace the battery
                    stop
                else
                    if (the car crank up but fail to start?)
                        Check spark plug connections
                        stop
                    else
                        if (the engine start and then die?)
                            if (your car has fuel injection?)
                                Get it in for service
                                stop
                            else
                                Check to ensure the choke is opening and closing
                                stop
                            endif
                        else
                            This should not be possible
                            stop
                        endif
                    endif
                endif
            endif
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? y/n ");
        String reply = sc.next();
        if (reply.equals("y") || reply.equals("Y")) {
            System.out.print("Are the battery terminals corroded? y/n ");
            reply = sc.next();
            if (reply.equals("y") || reply.equals("Y")) {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? y/n ");
            reply = sc.next();
            if (reply.equals("y") || reply.equals("Y")) {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            ///////////////////////////////////////////////////////////////////////
            else {
                System.out.print("Does the car crank up but fail to start? y/n ");
                reply = sc.next();
                if (reply.equals("y") || reply.equals("Y")) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {
                    System.out.print("Does the engine start and then die? y/n ");
                    reply = sc.next();
                    if (reply.equals("y") || reply.equals("Y")) {
                        System.out.print("Does you car have fuel injection? y/n ");
                        reply = sc.next();
                        if (reply.equals("y") || reply.equals("Y")) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
