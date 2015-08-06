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

}