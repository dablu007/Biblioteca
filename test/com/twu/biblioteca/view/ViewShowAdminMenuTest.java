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
        String expected = "1.List Books\n" + "2.Checkout a Book\n" + "3.Return a Book\n" + "4.List Movies\n"
                +"5.Checkout Movie\n" + "6.Return Movie\n" + "7.User Details\n"
                ;
        String expectedForAdmin = expected + "8.List Checkout Books\n" + "9.List Checkout Movie\n" + "10.Check Item Issued Against User\n" +
                 "11.Quit\n";
        assertEquals(expectedForAdmin, outContent.toString());
    }
}
