package com.diegodelacruz.days.week_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a Person class with an instance variable, age, and a constructor that takes an integer,
 * initialAge, as a parameter. The constructor must assign initialAge to age after confirming
 * the argument passed as initialAge is not negative;
 * if a negative argument is passed as initialAge, the constructor should set age to 0 and
 * print "Age is not valid, setting age to 0".In addition, you must write the following instance methods:
 * yearPasses() should increase the  instance variable by .
 * amIOld() should perform the following conditional actions:R
 * If age < 13, print "You are young.".
 * If  and , print "You are a teenager.".
 * Otherwise, print "You are old.".
 */
public class Day_4_ClassVsInstance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        List<Integer> listInt = new ArrayList<>();
        int counter = 0;
        while (counter < age && scan.hasNextLine()) {
            int scanInt = scan.nextInt();
            listInt.add(scanInt);
            counter++;
        }
        scan.close();

        for (int initialAge : listInt) {
            Person person = new Person(initialAge);
            person.yearPasses(initialAge);
            person.amIOld(initialAge);
        }
    }


    private static class Person {

        int age;

        private Person(int initialAge) {

            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        void yearPasses(int age) {
            age++;
        }

        void amIOld(int age) {
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }
}
