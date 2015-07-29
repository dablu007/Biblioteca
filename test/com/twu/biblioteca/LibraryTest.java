package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    private HashMap book;
    private ArrayList<HashMap> books;
    private IView view;
    private Library library;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUp(){
        book = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        view = mock(IView.class);
        books = new ArrayList<HashMap>();
        books.add(book);
        library = new Library(books);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldCheckoutABook() {
        library.checkoutBook(1);
        assertEquals("Books Successfully Checkout\n", outContent.toString());
    }
}
