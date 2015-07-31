package com.twu.biblioteca.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

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
        Book bookOne = new Book("Java","James Gosling","TMH");
        Book bookTwo = new Book("C++","Bjarne Stroutstrup","TMH");
        Book bookThree = new Book("C","Dennis Richie","TMH");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        Inputs input = new Inputs();
        assertEquals(books, input.addBooks());
    }

    @Test
    public void shouldTestTheBookNumberForCheckout() {
        Inputs inputs = new Inputs();

        assertEquals("1", inputs.getBookName());
    }
}
