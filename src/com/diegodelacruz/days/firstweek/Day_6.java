package com.diegodelacruz.days.firstweek;

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

        int space = 2;
        String firstString = "Hacker";
        String secondString = "Rank";

        String result1 = loopThroughString(firstString, space);
        String result2 = loopThroughString(secondString, space);
        System.out.println(result1);
        System.out.println(result2);

    }

    private static String loopThroughString(String anyString, int space) {
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
        result.append(" ".repeat(space - 1));
        result.append(odds);
        return result.toString();
    }

}