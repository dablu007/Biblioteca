package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    private HashMap book;
    private ArrayList<HashMap> books;
    private IView view;
    private Library library;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldCheckoutABookWhichHasTitle() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        books.add(book);
        Library library = new Library(books, checkoutBooks);

        library.checkoutBook("Java");
        assertEquals("Thank you! Enjoy the book\n", outContent.toString());

    }

    @Test
    public void shouldReturnACheckedOutBookWhichHasTitle() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        checkoutBooks.add(book);
        Library library = new Library(books, checkoutBooks);

        library.returnBook("Java");
        assertEquals("Thank you for returning the book.\n", outContent.toString());

    }
}
