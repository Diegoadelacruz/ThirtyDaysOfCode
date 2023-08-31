package com.diegodelacruz.days.week_1;


/**
 * Given an integer perform the following conditional actions:
 * If  is odd, print Weird
 * If  is even and in the inclusive range of 2 to 5, print Not Weird
 * If  is even and in the inclusive range of 6 to 20, print Weird
 * If  is even and greater than 20, print Not Weird
 */

public class Day_3_Conditionals {

    public static void main(String[] args) {
        int N = 18;
        if (N %2 == 0) {
            if(N >=2 && N <=5 || N > 20){
                System.out.println("Not Weird");
            }

            if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
