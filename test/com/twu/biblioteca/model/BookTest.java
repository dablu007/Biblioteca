package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    @Test
    public void shouldCheckWhetherTwoBooksAreEqual() {
        Book book = new Book("Java","James Gosling","TMH");
        Book anotherBook = new Book("Java","James Gosling","TMH");

        assertEquals(anotherBook, book);
    }
}
