package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    @Test
    public void shouldAddABookAndShowListOfBooksInTheLibrary() {
        Book virtualBook = mock(Book.class);
        ArrayList<Book> books = new ArrayList<>();
        books.add(virtualBook);
        Library library = new Library(books);

        library.showListOfBooks();

        verify(virtualBook, atLeast(1)).show();
    }
}
