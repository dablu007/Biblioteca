package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


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
        Library library = new Library(books);
        Menu menu = new Menu(library,view);

        menu.executeCommand("List Books");
        verify(view).showBook(book);
    }
}
