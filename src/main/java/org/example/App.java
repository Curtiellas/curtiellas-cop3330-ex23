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

        System.out.print( "Is the car silent when you turn on the key? " );
        String answer = sc.next();

        if (answer.equalsIgnoreCase("y"))
        {
            System.out.print( "Are the battery terminals corroded? " );
            answer = sc.next();

            if (answer.equalsIgnoreCase("y"))
                System.out.print( "Clean terminals and try starting again." );

            else
                System.out.print("Replace cables and try again.");
        }

        else
        {
            System.out.print( "Does the car make a slicking noise? " );
            answer = sc.next();

            if (answer.equalsIgnoreCase("y"))
                System.out.print("Replace the battery.");

            else
            {
                System.out.print( "Does the car crank up but fail to start? " );
                answer = sc.next();

                if (answer.equalsIgnoreCase("y"))
                    System.out.print("Check the spark plug connections.");

                else
                {
                    System.out.print( "Does the engine start and then die? " );
                    answer = sc.next();

                    if (answer.equalsIgnoreCase("y"))
                    {
                        System.out.print( "Does you car have fuel injection? " );
                        answer = sc.next();

                        if (answer.equalsIgnoreCase("y"))
                            System.out.print("Get it in for service.");

                        else
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }

                    else
                        System.out.print("This should not be possible.");
                }
            }
        }
    }
}