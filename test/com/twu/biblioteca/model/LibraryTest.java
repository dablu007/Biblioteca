package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


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
        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }

    @Test
    public void shouldReturnABookIfBookReturningIsCheckedOut(){
        HashMap anotherBook = new HashMap();
        anotherBook.put("bookNo", 1);
        anotherBook.put("bookName", "Java");
        anotherBook.put("availability", "not-available");
        anotherBook.put("author", "James Gosling");
        anotherBook.put("publication", "TMH");
        view = mock(IView.class);
        ArrayList<HashMap> anotherBooks = new ArrayList<HashMap>();
        anotherBooks.add(anotherBook);
        Library anotherlibrary = new Library(anotherBooks);
        anotherlibrary.returnBook(1);
        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }
}
