package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class MenuOptionsTest {

    @Test
    public void shouldGiveListBooksCommadForTheInput1() {
        Library library = mock(Library.class);
        MenuOptions menuOptions = new MenuOptions(library);
        IView view = mock(IView.class);

        ListBooks listBooks = new ListBooks(library, view);
        assertEquals(listBooks.getClass(), menuOptions.getOperation("1").getClass());

    }

    @Test
    public void shouldCallTheListMoviesCommandForInput5() {
        Library library = mock(Library.class);
        MenuOptions menuOptions = new MenuOptions(library);
        IView view = mock(IView.class);

        ListMovies listMovies = new ListMovies(library, view);
        assertEquals(listMovies.getClass(), menuOptions.getOperation("5").getClass());

    }
}
