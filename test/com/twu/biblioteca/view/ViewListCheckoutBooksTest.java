package com.twu.biblioteca.view;

import com.twu.biblioteca.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ViewListCheckoutBooksTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldListAllTheCheckoutBooksAvailableInLibrary() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<IRentableType> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        Library library = new Library(availableBooks, new ArrayList<IRentableType>());
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem("Java", RentableType.BOOK, user);
        ViewListCheckoutBooks viewListCheckoutBooks = new ViewListCheckoutBooks(library);
        viewListCheckoutBooks.show();

        String expectedList = "Thank you! Enjoy the BOOK\n"+
                "------------------------------Checkout Books--------------------------\n"
                +String.format("%17s%27s%27s", "BookName", "Author", "Publication") + "\n" +
                String.format("%15s%29s%25s", book.getBookName(), book.getAuthor(), book.getPublication())+
                "\n" +
                "----------------------------------------------------------------------\n";
        assertEquals(expectedList.toString(), outContent.toString());
    }
}
