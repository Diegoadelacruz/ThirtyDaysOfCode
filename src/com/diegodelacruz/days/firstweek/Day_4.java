package com.diegodelacruz.days.firstweek;

import java.util.Scanner;

/**
 * Write a Person class with an instance variable, age, and a constructor that takes an integer,
 * initialAge, as a parameter. The constructor must assign initialAge to age after confirming
 * the argument passed as initialAge is not negative;
 * if a negative argument is passed as initialAge, the constructor should set age to 0 and
 * print "Age is not valid, setting age to 0".In addition, you must write the following instance methods:
 * yearPasses() should increase the  instance variable by .
 * amIOld() should perform the following conditional actions:
 * If age < 13, print "You are young.".
 * If  and , print "You are a teenager.".
 * Otherwise, print "You are old.".
 */
public class Day_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ages = scan.nextInt();
        int age = 1;

        scan.nextLine();

        do {
            int anyInt = scan.nextInt();
            Person person = new Person(anyInt);
            ages--;
        } while (ages < age);
        scan.close();


    }


    static class Person {

        int age;

        public Person(int initialAge) {
            initialAge = age;

            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }

        }

        void yearPasses() {
            age++;
        }

        void amIOld() {
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
