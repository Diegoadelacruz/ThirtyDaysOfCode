package com.diegodelacruz.days.week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array, A, of N integers, print A's elements
 * in reverse order as a single line of space-separated numbers.
 */
public class Day_7_Arrays {

    /**
     * Example
     * A = [1,2,3,4]
     * Print 4,3,2,1
     */
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 4, 3, 2);
        List<Integer> arr = new ArrayList<>(4);
        arr.addAll(array);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
