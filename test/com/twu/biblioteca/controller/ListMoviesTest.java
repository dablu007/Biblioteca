package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewListMovies;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListMoviesTest {

    @Test
    public void shouldListTheAvailableMovies() {
        Library library = mock(Library.class);
        IView view = mock(ViewListMovies.class);
        IOperation operation = new ListMovies(library, view);

        operation.execute();
        verify(view).show();
    }
}
