package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {
    @Test
    public void shouldAddABookAndShowListOfBooksInTheLibrary() {
        Book book = new Book(1,"Java","available","James Gosling","TMH");
        View view = mock(View.class);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        Library library = new Library(books);

        library.showListOfBooks(view);

        verify(view, atLeast(1)).showBook(book);
    }
}
