package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ListCheckoutBooksTest {

    @Test
    public void shouldListAllTheBooks() {
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        IOperation listCheckoutBooks = new ListCheckoutBooks(library, view);

        listCheckoutBooks.execute();
        verify(view).show();
    }
}
