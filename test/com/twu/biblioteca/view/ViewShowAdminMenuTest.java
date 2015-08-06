package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewShowAdminMenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowTheMenuOptionsForAdmin() {
        IView view = new ViewShowAdminMenu();

        view.show();
        String expected = "1.List Checkout Books\n" + "2.List Checkout Movie\n" + "3.Check Item Issued Against User\n" +
                 "4.Quit\n";
        assertEquals(expected, outContent.toString());
    }
}
