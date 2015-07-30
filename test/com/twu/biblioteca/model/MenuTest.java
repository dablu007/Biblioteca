package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewInvalidMessage;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class MenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldExecuteACommandWithMenu() {
        HashMap book = new HashMap();
        book.put("bookNo", 1);
        book.put("bookName", "Java");
        book.put("availability", "available");
        book.put("author", "James Gosling");
        book.put("publication", "TMH");
        ArrayList<HashMap> books = new ArrayList<HashMap>();
        books.add(book);
        Library library = new Library(books);
        Formatter formatter = new Formatter(library);
        IView view = mock(IView.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(1);
        verify(view).show();
    }

    @Test
    public void shouldExitWhenTheCommandIsQuit() {
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(4);
        verify(library).exit();
    }

    @Test
    public void shouldShowInvalidWhenMenuOptionIsInvalid() {
        Library library = mock(Library.class);
        IView view = new ViewInvalidMessage();
        Menu menu = new Menu(library, view);

        menu.executeCommand(10);
        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldDoNothingWhenInputPassedIsNothing(){
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(null);
    }
}
