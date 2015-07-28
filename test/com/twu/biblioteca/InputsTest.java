package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputsTest {
    @Test
    public void shouldAddBooksInitiallyToTheLibrary() {
        ArrayList bookOne = new ArrayList();
        ArrayList bookTwo = new ArrayList();
        bookOne.add(1);bookOne.add("Java");bookOne.add("available");bookOne.add("James Gosling");bookOne.add("TMH");
        bookTwo.add(2);bookTwo.add("C++");bookTwo.add("available");bookTwo.add("Bjarne Stroustrup");bookTwo.add("TMH");
        ArrayList<ArrayList> books = new ArrayList<ArrayList>();
        books.add(bookOne);
        books.add(bookTwo);
        Inputs input = new Inputs();
        assertEquals(books, input.addBooks());
    }
}
