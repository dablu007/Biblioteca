package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputsTest {
    @Test
    public void shouldAddBooksInitiallyToTheLibrary() {
        HashMap bookOne = new HashMap();
        HashMap bookTwo = new HashMap();
        bookOne.put("bookNo", 1);
        bookOne.put("bookName", "Java");
        bookOne.put("availability", "available");
        bookOne.put("author", "James Gosling");
        bookOne.put("publication", "TMH");
        bookTwo.put("bookNo", 2);
        bookTwo.put("bookName", "C++");
        bookTwo.put("availability", "available");
        bookTwo.put("author", "James Stroutstrup");
        bookTwo.put("publication", "TMH");
        ArrayList<HashMap> books = new ArrayList<HashMap>();
        books.add(bookOne);
        books.add(bookTwo);
        Inputs input = new Inputs();
        assertEquals(books, input.addBooks());
    }
}
