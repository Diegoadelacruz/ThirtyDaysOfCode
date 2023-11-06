package com.diegodelacruz.days.week_2;

public class Day_12_Inheritance {

    class Person {

    }

    class Student extends Person {

        String firstName;

        String lastName;

        int idNumber;

        int[] scores;


        Student(String firstName, String lastName, int idNumber, int[] scores) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.scores = scores;
        }

        void calculate(int average){

        }

    }

}


