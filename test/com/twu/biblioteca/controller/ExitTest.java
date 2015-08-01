package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ExitTest {

    @Test
    public void shouldExitForExitCommand() {
        Library library = mock(Library.class);
        IOperation exit = new Exit(library);

        exit.execute();
        verify(library).exit();
    }
}
