package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Is the car silent when you turn on the key?" );
        String answer = sc.next();

        if (answer.equalsIgnoreCase("y"))
        {
            System.out.println( "Are the battery terminals corroded?" );
            answer = sc.next();

            if (answer.equalsIgnoreCase("y"))
                System.out.println( "Clean terminals and try starting again." );

            else
                System.out.println("Replace cables and try again.");
        }

        else
        {
            System.out.println( "Does the car make a slicking noise?" );
            answer = sc.next();

            if (answer.equalsIgnoreCase("y"))
                System.out.println("Replace the battery.");

            else
            {
                System.out.println( "Does the car crank up but fail to start?" );
                answer = sc.next();

                if (answer.equalsIgnoreCase("y"))
                    System.out.println("Check the spark plug connections.");

                else
                {
                    System.out.println( "Does the engine start and then die?" );
                    answer = sc.next();

                    if (answer.equalsIgnoreCase("y"))
                    {
                        System.out.println( "Does you car have fuel injection?" );
                        answer = sc.next();

                        if (answer.equalsIgnoreCase("y"))
                            System.out.println("Get it in for service.");

                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }

                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}