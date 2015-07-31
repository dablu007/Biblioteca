package com.twu.biblioteca.model;

import java.util.ArrayList;

public class Formatter {
    private ArrayList<Book> books;
    private Library library;
    private Book book;
    public Formatter(Library library) {
        this.library = library;
    }

    public ArrayList<Book> format() {
        ArrayList<Book> newBooks = new ArrayList<>();
        books = library.getAvailableBooks();
        for (int i = 0; i <books.size(); i++) {
            newBooks.add(books.get(i));
        }
        return newBooks;
    }
}
