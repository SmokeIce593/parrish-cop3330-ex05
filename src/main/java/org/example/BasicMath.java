/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

class BasicMath {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the first number?" );
        String firststring = input.nextLine();

        System.out.print( "What is the second number?" );
        String secondstring = input.nextLine();

        int firstint = Integer.parseInt(firststring);
        int secondint = Integer.parseInt(secondstring);

        System.out.printf("%d + %d = %d" +
                "\n%d - %d = %d" +
                "\n%d * %d = %d" +
                "\n%d / %d = %d",
                firstint, secondint, firstint + secondint,
                firstint, secondint, firstint - secondint,
                firstint, secondint, firstint * secondint,
                firstint, secondint, firstint / secondint);
    }
}