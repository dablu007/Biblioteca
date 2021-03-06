package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class MenuOptionsTest {

    @Test
    public void shouldGiveListBooksForTheInput1() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        MenuOptions menuOptions = new MenuOptions(library, user);
        IView view = mock(IView.class);

        ListBooks listBooks = new ListBooks(library, view);
        assertEquals(listBooks.getClass(), menuOptions.getOperation("1").getClass());

    }

    @Test
    public void shouldCallTheListMoviesForInput4() {
        User user = mock(User.class);
        Library library = mock(Library.class);
        MenuOptions menuOptions = new MenuOptions(library, user);
        IView view = mock(IView.class);

        ListMovies listMovies = new ListMovies(library, view);
        assertEquals(listMovies.getClass(), menuOptions.getOperation("4").getClass());
    }

    @Test
    public void shouldCallTheListUserInfoForInput7() {
        User user = mock(User.class);
        Library library = mock(Library.class);
        MenuOptions menuOptions = new MenuOptions(library, user);
        IView view = mock(IView.class);

        ListUserInfo listUserInfo = new ListUserInfo(view);
        assertEquals(listUserInfo.getClass(), menuOptions.getOperation("7").getClass());
    }

    @Test
    public void shouldCallTheReturnMovieForInput6() {
        User user = mock(User.class);
        Library library = mock(Library.class);
        MenuOptions menuOptions = new MenuOptions(library, user);
        IView view = mock(IView.class);

        ReturnMovie returnMovie = new ReturnMovie(library);
        assertEquals(returnMovie.getClass(), menuOptions.getOperation("6").getClass());
    }
}
