package com.diegodelacruz.days.week_2;

/**
 * Complete the factorial function in the editor below. Be sure to use recursion.
 */
public class Day_9_Recursion3 {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
}
