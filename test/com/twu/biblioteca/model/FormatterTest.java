package com.twu.biblioteca;

import com.twu.biblioteca.model.Formatter;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class FormatterTest {
    private HashMap book;
    private ArrayList<HashMap> books;
    private Library library;
    private HashMap book1;

    @Test
    public void shouldListBooksFromLibrary() {
        book = new HashMap();
        book1 = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        book1.put("bookNo", 2);
        book1.put("bookName", "C++");
        book1.put("availability", "available");
        book1.put("author", "James Gosling");
        book1.put("publication", "TMH");
        books = new ArrayList<HashMap>();
        books.add(book);
        books.add(book1);
        library = new Library(books);
        Formatter formatter = new Formatter(library);
        assertEquals(books, formatter.format());
    }

    @Test
    public void shouldListBooksAvailableFromLibrary() {
        book = new HashMap();
        book1 = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "not-available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        book1.put("bookNo", 2);
        book1.put("bookName", "C++");
        book1.put("availability", "available");
        book1.put("author", "James Gosling");
        book1.put("publication", "TMH");
        books = new ArrayList<HashMap>();
        books.add(book);
        books.add(book1);
        library = new Library(books);
        Formatter formatter = new Formatter(library);
        ArrayList<HashMap> expectedBooks = new ArrayList();
        expectedBooks.add(book1);
        assertEquals(expectedBooks, formatter.format());
    }
}
