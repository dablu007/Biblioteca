package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListUserInfoTest {

    @Test
    public void shouldListTheInfoForTheCurrentLoggedInUser() {
        IView view = mock(IView.class);
        IOperation listUserInfo = new ListUserInfo(view);

        listUserInfo.execute();
        verify(view).show();
    }
}
