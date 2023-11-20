package com.diegodelacruz.days.week_2;

public class Day_12_Inheritance {

    public static void main(String[] args) {
        int[] testScores = new int[]{90, 70};
        Student s = new Student("Diego", "de la Cruz", 9, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {

    String firstName;

    String lastName;

    int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }
}

class Student extends Person {

    int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        int a = 0;

        for (int i : testScores)
            a += i;

        int average = a / testScores.length;

        if (average <= 100 && average >= 90) {
            return 'O';
        } else if (average < 90 && average >= 80) {
            return 'E';
        } else if (average < 80 && average >= 70) {
            return 'A';
        } else if (average < 70 && average >= 55) {
            return 'P';
        } else if (average < 55 && average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

}




