package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class BookTest {

    @Test
    public void shouldCheckWhetherTwoBooksAreEqualHavingSameTitle() {
        Book book = new Book("Java","James Gosling","TMH");

        assertTrue(book.hasTitle("Java"));
    }
}
