package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class AdminMenuOptionsTest {

    @Test
    public void shouldGiveListCheckoutBooksForTheInput1() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        AdminMenuOptions menuOptions = new AdminMenuOptions(library, user);
        IView view = mock(IView.class);
        ListCheckoutBooks listCheckoutBooks = new ListCheckoutBooks(library, view);

        assertEquals(listCheckoutBooks.getClass(), menuOptions.getOperation("1").getClass());

    }

    @Test
    public void shouldGiveListCheckoutMoviesForTheInput2() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        AdminMenuOptions menuOptions = new AdminMenuOptions(library, user);
        IView view = mock(IView.class);
        ListCheckoutMovies listCheckoutMovies = new ListCheckoutMovies(library, view);

        assertEquals(listCheckoutMovies.getClass(), menuOptions.getOperation("2").getClass());

    }

    @Test
    public void shouldExitForTheInput10() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        AdminMenuOptions menuOptions = new AdminMenuOptions(library, user);
        IView view = mock(IView.class);
        Exit exit = new Exit(library);
        assertEquals(exit.getClass(), menuOptions.getOperation("4").getClass());

    }
}