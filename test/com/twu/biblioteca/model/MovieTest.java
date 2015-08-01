package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MovieTest {

    @Test
    public void shouldMatchMovieWithTheSameNameGiven() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");

        assertTrue(movie.hasName("Harry Potter 1"));
    }
}
