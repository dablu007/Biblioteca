package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<ArrayList> books;

    public Library(ArrayList<ArrayList> books) {
        this.books = books;
    }

    public void showListOfBooks(View view) {
        for (int i = 0; i < books.size(); i++) {
            view.showBook(books.get(i));
        }
    }
}
