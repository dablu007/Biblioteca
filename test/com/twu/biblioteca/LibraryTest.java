package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    @Test
    public void shouldAddABookAndShowListOfBooksInTheLibrary() {
        ArrayList book = new ArrayList();
        book.add(1);
        book.add("Java");
        book.add("available");
        book.add("James Gosling");
        book.add("TMH");
        View view = mock(View.class);
        ArrayList<ArrayList> books = new ArrayList<ArrayList>();
        books.add(book);
        Library library = new Library(books);

        library.showListOfBooks(view);

        verify(view, atLeast(1)).showBook(book);
    }
}
