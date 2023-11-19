package com.diegodelacruz.days.week_2;

public class Day_13_Abstract_Classes extends Book {

    int price;

    public static void main(String[] args) {
        Book book = new Day_13_Abstract_Classes("Codigo da Vinci", "Dan Brown", 300);
        book.display();
    }


    Day_13_Abstract_Classes(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
