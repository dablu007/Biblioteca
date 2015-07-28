package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ArrayList book = new ArrayList();
        book.add(1);
        book.add("Java");
        book.add("available");
        book.add("James Gosling");
        book.add("TMH");
        ArrayList<ArrayList> books = new ArrayList<>();
        books.add(book);
        Library library = new Library(books);
        view.showWelcomeMessage();
        library.showListOfBooks(view);
    }
}
