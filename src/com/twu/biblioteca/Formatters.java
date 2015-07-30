package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Formatters {
    private ArrayList<HashMap> books;
    private Library library;
    private HashMap book;
    public Formatters(Library library) {
        this.library = library;
    }

    public ArrayList<HashMap> format() {
        ArrayList<HashMap> newBooks = new ArrayList<>();
        books = library.getBooks();
        book = new HashMap();
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("availability").equals("not-available"))
                continue;
            newBooks.add(book);
        }
        return newBooks;
    }
}
