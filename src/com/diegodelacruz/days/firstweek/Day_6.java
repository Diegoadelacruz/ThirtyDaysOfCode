package com.diegodelacruz.days.firstweek;

import java.util.Scanner;

/**
 * Given a string, S, of length N that is indexed from 0 to N -1 ,
 * print its even-indexed and odd-indexed characters as 2 space-separated
 * strings on a single line (see the Sample below for more detail).
 */
public class Day_6 {

    /**
     * Example
     * s = adbecf
     * Print abc def
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce spaces: ");
        int space = scan.nextInt();
        scan.nextLine();
        while (scan.hasNextLine()) {
            String anyString = scan.nextLine();
            String result = loopThroughString(anyString);
            System.out.println(result);
        }
        scan.close();
    }

    private static String loopThroughString(String anyString) {
        char[] stringCharArray = anyString.toCharArray();
        StringBuilder odds = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringCharArray.length; i++) {

            if (i % 2 == 0) {
                even.append(stringCharArray[i]);
            }

            if (i % 2 != 0) {
                odds.append(stringCharArray[i]);
            }
        }
        result.append(even);
        result.append(" ".repeat(1));
        result.append(odds);
        return result.toString();
    }

}