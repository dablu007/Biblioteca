package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    private HashMap book;
    private ArrayList<HashMap> books;
    private View view;
    private Library library;
    @Before
    public void setUp(){
        book = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        view = mock(View.class);
        books = new ArrayList<HashMap>();
        books.add(book);
        library = new Library(books, view);

    }
    @Test
    public void shouldAddABookAndShowListOfBooksInTheLibrary() {
        library.showListOfBooks();
        verify(view, atLeast(1)).showBook(book);
    }

    @Test
    public void shouldCheckOutABook() {
        library.checkoutBook(1);
        verify(view).showCheckOutMessage();
    }
}
