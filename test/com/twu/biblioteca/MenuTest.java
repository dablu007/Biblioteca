package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.*;


public class MenuTest {

    @Test
    public void shouldExecuteACommandWithMenu() {
        HashMap book = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        View view = mock(View.class);
        ArrayList<HashMap> books = new ArrayList<HashMap>();
        books.add(book);
        Library library = new Library(books, view);
        Menu menu = new Menu(library, view);

        menu.executeCommand(1);
        verify(view).showBook(book);
    }

    @Test
    public void shouldExitWhenTheCommandIsQuit() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(3);
        verify(library).exit();
    }

    @Test
    public void shouldShowInvalidWhenMenuOptionIsInvalid() {
        Library library = mock(Library.class);
        View view = mock(View.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(10);
        verify(view).showInvalidMessage();
    }
}
