package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.ViewInvalidMessage;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InvalidMessageTest {

    @Test
    public void shouldCheckForTheInvalidMessageToBeShownForInvalidOption() {
        ViewInvalidMessage viewInvalidMessage = mock(ViewInvalidMessage.class);
        IOperation invalidMessage= new InvalidMessage(viewInvalidMessage);

        invalidMessage.execute();
        verify(viewInvalidMessage).show();
    }
}
