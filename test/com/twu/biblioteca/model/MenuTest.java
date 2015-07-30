package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewInvalidMessage;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class MenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputContent = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inputContent);
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

        menu.executeCommand("1");
        verify(view).show();
    }

    @Test
    public void shouldExitWhenTheCommandIsQuit() {
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand("4");
        verify(library).exit();
    }

    @Test
    public void shouldShowInvalidWhenMenuOptionIsInvalid() {
        Library library = mock(Library.class);
        IView view = new ViewInvalidMessage();
        Menu menu = new Menu(library, view);

        menu.executeCommand("10");
        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldDoNothingWhenInputPassedIsNothing(){
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Menu menu = new Menu(library, view);

        menu.executeCommand(null);
    }

    @Test
    public void shouldCheckoutAValidBook(){
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Inputs inputs = mock(Inputs.class);
        Menu menu = new Menu(library, view);


        menu.executeCommand("2");
        assertEquals("Enter A Book Number\n", outContent.toString());
        verify(library).checkoutBook("1");
    }

    @Test
    public void shouldReturnAValidBook() {
        Library library = mock(Library.class);
        IView view = mock(IView.class);
        Inputs inputs = mock(Inputs.class);
        Menu menu = new Menu(library, view);


        menu.executeCommand("3");
        assertEquals("Enter A Book Number\n", outContent.toString());
        verify(library).returnBook("1");
    }

    @Test
    public void showInvalidMenuWhenOptionEnteredIsNotValid() {
        Library library = mock(Library.class);
        IView view = new ViewInvalidMessage();
        Menu menu = new Menu(library, view);

        menu.executeCommand("list books not");
        assertEquals("Select a valid option!\n", outContent.toString());
    }
}
