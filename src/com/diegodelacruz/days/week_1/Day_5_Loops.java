package com.diegodelacruz.days.week_1;

/**
 * Given an integer print its first  multiples.
 * Each multiple  (where ) should be printed on a
 * new line in the form: n x i = result.
 */
public class Day_5_Loops {

    public static void main(String[] args) {

        int n = 2;

        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }

    }
}
