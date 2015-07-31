package com.twu.biblioteca.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FormatterTest {
    private Book book;
    private Book book1;
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> anotherBooks;
    private ArrayList<Book> checkoutBooks;
    private Library library;

    @Test
    public void shouldListBooksFromLibrary() {
        book = new Book("Java","James Gosling","TMH");
        book1 = new Book("C++","Bjarne Stroutstrup","TMH");
        availableBooks = new ArrayList<>();
        checkoutBooks = new ArrayList<>();
        availableBooks.add(book);
        library = new Library(availableBooks, checkoutBooks);
        Formatter formatter = new Formatter(library);
        Book anotherBook = new Book("Java","James Gosling","TMH");
        anotherBooks = new ArrayList<>();
        anotherBooks.add(anotherBook);
        assertEquals(anotherBooks.get(0), formatter.format().get(0));
    }
}
