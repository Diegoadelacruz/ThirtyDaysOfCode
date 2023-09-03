package com.diegodelacruz.days.week_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given n names and phone numbers, assemble a phone book that maps friends'
 * names to their respective phone numbers. You will then be given an unknown
 * number of names to query your phone book for. For each name queried, print the
 * associated entry from your phone book on a new line in the form name=phoneNumber;
 * if an entry for name is not found, print Not found instead.
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 */
public class Day_8_Maps {

    /**
     * The first line contains an integer, n, denoting the number of entries in the phone book.
     * Each of the n  subsequent lines describes an entry in the form of 2 space-separated values
     * on a single line. The first value is a friend's name, and the second value is an -digit phone number.
     * After the n lines of phone book entries, there are an unknown number of lines of queries. Each line
     * (query) contains a name to look up, and you must continue reading lines until there is no more input.
     * Note: Names consist of lowercase English alphabetic letters and are first names only.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        Map<String, Integer> phoneBook = new HashMap<>();

        System.out.println("Introduce phone numbers: ");
        int phoneNums = scanner.nextInt();
        scanner.nextLine();

        while (scanner.hasNextLine() || counter >= phoneNums) {
            String contact = scanner.nextLine();
            Integer number = scanner.nextInt();
            phoneBook.put(contact, number);
            counter ++;
        }
        System.out.println(phoneBook);
    }
}
