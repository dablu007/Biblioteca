package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Formatter;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.ViewListOfBooks;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class ViewListOfBooksTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldListAllTheBooksAvailableInLibrary() {
        HashMap book = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        ArrayList<HashMap> books = new ArrayList<HashMap>();
        books.add(book);
        Library library = new Library(books);
        Formatter formatter = new Formatter(library);
        ViewListOfBooks viewListOfBooks = new ViewListOfBooks(formatter);
        viewListOfBooks.show();

        String expectedList = "------------------------------Avilable Books--------------------------\n"
                +String.format("%s%17s%17s%27s", "Book No.", "BookName", "Author", "Publication") + "\n" +
                String.format("%s%20s%27s%17s", book.get("bookNo"), book.get("bookName"), book.get("author"),
                        book.get("publication")) + "\n" +
                        "----------------------------------------------------------------------\n";
        assertEquals(expectedList.toString(), outContent.toString());
    }
}
