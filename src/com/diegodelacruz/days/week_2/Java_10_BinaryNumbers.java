package com.diegodelacruz.days.week_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 * When working with different bases, it is common to show the base as a subscript.
 */
public class Java_10_BinaryNumbers {

    /**
     * Example:
     * 13 / 2 = 6 con un residuo de 1
     * 6 / 2 = 3 con un residuo de 0
     * 3 / 2 = 1 con un residuo de 1
     * 1 / 2 = 0 con un residuo de 1
     */
    private static int toBinaryConverter(int number) {
        List<Integer> binaryNum = new ArrayList<>();
        int counter = 1;
        int newCounter = 0;

        while (0 < number) {
            if (number % 2 == 1) {
                binaryNum.add(1);
            } else {
                binaryNum.add(0);
            }
            number /= 2;
        }

        System.out.println(binaryNum);

        if (binaryNum.size() < 2) {
            return counter;
        }

        for (int i = 0; i < binaryNum.size() - 1; i++) {
            if (binaryNum.get(i).equals(binaryNum.get(i + 1))) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > newCounter) {
                newCounter = counter;
            }

        }
        return newCounter;
    }

    public static void main(String[] args) {
        int number = toBinaryConverter(13);
        System.out.println(number);
    }
}
