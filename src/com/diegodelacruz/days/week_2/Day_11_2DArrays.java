package com.diegodelacruz.days.week_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Given 6 x 6 2D Array, A:
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * <p>
 * We define an hourglass in A to be a subset of values with indices
 * falling in this pattern in A's graphical representation:
 * <p>
 * a b c
 * d
 * e f g
 */
public class Day_11_2DArrays {


    /**
     * Example:
     * <p>
     * Input Format:
     * There are 6 lines of input, where each line contains
     * 6 space-separated integers that describe the 2D Array A.
     * <p>
     * Output format:
     * Print the maximum hourglass sum in A .
     * <p>
     * Sample Input:
     * 1 1 1 0 0 0
     * 0 1 0 0 0 0
     * 1 1 1 0 0 0
     * 0 0 2 4 4 0
     * 0 0 0 2 0 0
     * 0 0 1 2 4 0
     * <p>
     * Sample Output:
     * 19
     */
    public static void main(String[] args) {
        int newValue = 0;

        List<List<Integer>> arr2dW = new ArrayList<>();

        arr2dW.add(new ArrayList<>(List.of(1, 1, 1, 0, 0, 0)));
        arr2dW.add(new ArrayList<>(List.of(0, 1, 0, 0, 0, 0)));
        arr2dW.add(new ArrayList<>(List.of(1, 1, 1, 0, 0, 0)));
        arr2dW.add(new ArrayList<>(List.of(0, 0, 2, 4, 4, 0)));
        arr2dW.add(new ArrayList<>(List.of(0, 0, 0, 2, 0, 0)));
        arr2dW.add(new ArrayList<>(List.of(0, 0, 1, 2, 4, 0)));

        int rows = arr2dW.size();
        int columns = arr2dW.get(0).size();
        int groupNumber = 3;
        int nextValue = 1;

        for (int row = 0; row < rows; row++) {
            if (row > 3) {
                break;
            }
            for (int column = 0; column < columns; column += nextValue) {
                if (column > 3) {
                    break;
                }
                int groupSum = 0;
                for (int i = row; i < row + groupNumber; i++) {
                    for (int j = column; j < column + groupNumber; j++) {
                        System.out.print(arr2dW.get(i).get(j));
                        groupSum += arr2dW.get(i).get(j);
                    }
                    System.out.println();
                }
                System.out.println("Group sum: " + groupSum);
                if (groupSum > newValue) {
                    newValue = groupSum;
                }
            }
        }
        System.out.println("Max Value: " + newValue);

        /*
        int[][] arr2d = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int rows = arr2d.length;
        int columns = arr2d[0].length;
        int groupNumber = 3;
        int nextValue = 1;

        for (int row = 0; row < rows; row++) {
            if (row > 3) {
                break;
            }
            for (int column = 0; column < columns; column += nextValue) {
                if (column > 3) {
                    break;
                }
                int groupSum = 0;
                for (int i = row; i < row + groupNumber; i++) {
                    for (int j = column; j < column + groupNumber; j++) {
                        System.out.print(arr2d[i][j]);
                        groupSum += arr2d[i][j];
                    }
                    System.out.println();
                }
                System.out.println("Group sum: " + groupSum);
                if (groupSum > newValue) {
                    newValue = groupSum;
                }
            }
        }
        System.out.println("Max Value: " + newValue); */
    }
}