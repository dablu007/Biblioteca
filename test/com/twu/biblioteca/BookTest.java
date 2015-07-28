package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    @Test
    public void shouldGiveABookNumber() {
        Book book = new Book(1,"Java","available","James Gosling","TMH");

        assertEquals(1, book.getBookNo());
    }
}
