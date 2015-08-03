package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {


    private ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter 1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inputStream);
    }

    @After
    public void setAfter() {
        System.setIn(System.in);
    }

    @Test
    public void shouldCheckoutAValidMovie() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        IView view = mock(IView.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, view);

        checkoutMovie.execute();
        verify(library).checkoutItem("Harry Potter 1", RentableType.MOVIE);
    }
}
