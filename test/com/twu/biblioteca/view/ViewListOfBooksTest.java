package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ViewListOfBooksTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldListAllTheBooksAvailableInLibrary() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        Library library = new Library(availableBooks, new ArrayList<Book>());
        ViewListOfBooks viewListOfBooks = new ViewListOfBooks(library);
        viewListOfBooks.show();

        String expectedList = "------------------------------Avilable Books--------------------------\n"
                +String.format("%17s%27s%27s", "BookName", "Author", "Publication") + "\n" +
                String.format("%15s%29s%25s", book.getBookName(), book.getAuthor(), book.getPublication())+
                         "\n" +
                        "----------------------------------------------------------------------\n";
        assertEquals(expectedList.toString(), outContent.toString());
    }
}
