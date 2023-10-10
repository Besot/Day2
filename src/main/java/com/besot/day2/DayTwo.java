package com.besot.day2;

import com.besot.day2.library.Book;

public class DayTwo {
    public static void main(String[] args) {
        //String variable = String object;
        String hello = new String("Hello");
        System.out.println("This is the first: " + hello + " This is the second hello with just the constructor" + new String(" I am the second hello"));

        Book libraryBook = new Book();
        libraryBook.setName("Spider Man");
        System.out.println(libraryBook.getName());

    }
}