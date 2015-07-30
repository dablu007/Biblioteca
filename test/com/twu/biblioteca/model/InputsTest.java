package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class InputsTest {
    private ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inputStream);
    }

    @After
    public void setAfter(){
        System.setIn(System.in);
    }

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

    @Test
    public void shouldTestTheBookNumberForCheckout() {
        Inputs inputs = new Inputs();

        assertEquals(1, inputs.getBookNoForCheckout());
    }
}
