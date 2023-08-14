package com.diegodelacruz.days;

import java.util.Scanner;

/*
* Declare  variables: one of type int, one of type double, and one of type String.
* Print the sum of  plus your int variable on a new line.
* Print the sum of  plus your double variable to a scale of one decimal place on a new line.
* Concatenate  with the string you read as input and print the result on a new line.
 */
public class DayOne {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        // Create a Scanner object to read input from stdin.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        // Read a full line of input from stdin and save it to our variable, inputString.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);

        scan.close();
    }

}
