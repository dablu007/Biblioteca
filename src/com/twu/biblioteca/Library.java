package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<HashMap> books;

    public Library(ArrayList<HashMap> books) {
        this.books = books;
    }

    public void showListOfBooks(View view) {
        for (int i = 0; i < books.size(); i++) {
            view.showBook(books.get(i));
        }
    }
}
