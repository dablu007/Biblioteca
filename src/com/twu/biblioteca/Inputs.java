package com.twu.biblioteca;

import java.util.ArrayList;

public class Inputs {
    public ArrayList<ArrayList> addBooks() {
        ArrayList bookOne = new ArrayList();
        ArrayList bookTwo = new ArrayList();
        ArrayList<ArrayList> books = new ArrayList<ArrayList>();
        bookOne.add(1);bookOne.add("Java");bookOne.add("available");bookOne.add("James Gosling");bookOne.add("TMH");
        books.add(bookOne);
        bookTwo.add(2);bookTwo.add("C++");bookTwo.add("available");bookTwo.add("Bjarne Stroustrup");bookTwo.add("TMH");
        books.add(bookTwo);
        return books;
    }
}
