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
    public void shouldAddBooksAndMoviesInitiallyToTheLibrary() {
        Book bookOne = new Book("Java","James Gosling","TMH");
        Book bookTwo = new Book("C++","Bjarne Stroutstrup","TMH");
        Book bookThree = new Book("C","Dennis Richie","TMH");
        Movie movieOne = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        Movie movieTwo = new Movie("Harry Potter 2","2004","Chris Columbus","9");
        Movie movieThree = new Movie("Harry Potter 3","2005","Chris Columbus","8");
        ArrayList<IRentableType> list = new ArrayList<IRentableType>();
        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);
        list.add(movieOne);
        list.add(movieTwo);
        list.add(movieThree);
        Inputs input = new Inputs();
        assertEquals(list, input.addItems());
    }

    @Test
    public void shouldTestTheBookNumberForCheckout() {
        Inputs inputs = new Inputs();

        assertEquals("1", inputs.getBookName());
    }
}
