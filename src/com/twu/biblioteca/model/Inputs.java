package com.twu.biblioteca.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inputs {
    public ArrayList<Book> addBooks() {
        Book bookOne = new Book("Java","James Gosling","TMH");
        Book bookTwo = new Book("C++","Bjarne Stroutstrup","TMH");
        Book bookThree = new Book("C","Dennis Richie","TMH");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        return books;
    }

    public String getBookName() {
        String bookNoForCheckout = new String();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bookNoForCheckout = bufferedReader.readLine();
            return bookNoForCheckout;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookNoForCheckout;
    }
}
