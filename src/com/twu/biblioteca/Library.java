package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void showListOfBooks() {
        for(Book book: books){
            book.show();
        }
    }
}
