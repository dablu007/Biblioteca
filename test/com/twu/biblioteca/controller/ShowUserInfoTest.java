package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewListUserInfo;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShowUserInfoTest {

    @Test
    public void shouldShowTheUserInfoOfCurrentlyLoggedInUser() {
        IView view = mock(ViewListUserInfo.class);
        IOperation operation = new ShowUserInfo(view);

        operation.execute();
        verify(view).show();
    }
}
