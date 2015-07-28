package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Inputs inputs = new Inputs();
        ArrayList<ArrayList> books = inputs.addBooks();
        Library library = new Library(books);
        view.showWelcomeMessage();
        view.showListBookMessage();
        library.showListOfBooks(view);
    }
}
