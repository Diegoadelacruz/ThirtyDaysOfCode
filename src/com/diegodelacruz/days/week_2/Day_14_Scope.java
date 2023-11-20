package com.diegodelacruz.days.week_2;

public class Day_14_Scope {

    private int[] elements;
    public int maximumDifference;

    public Day_14_Scope(int[] _elements) {
        this.elements = _elements;
    }

    void computeDifference() {
        int difference;
        maximumDifference = elements[elements.length - 1] - elements[0];

        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (i != j) {
                    int element = elements[i];
                    int nextElement = elements[j + 1];
                    difference = element >= nextElement ? element - nextElement : nextElement - element;
                    if (difference > maximumDifference) {
                        maximumDifference = difference;
                    }
                }
            }
        }
    }
}

class Solution {

    public static void main(String[] args) {

        int[] a = new int[]{8, 19, 3, 2, 7};

        Day_14_Scope difference = new Day_14_Scope(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

