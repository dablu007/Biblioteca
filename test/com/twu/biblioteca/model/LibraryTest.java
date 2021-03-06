package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class LibraryTest {
    private HashMap book;
    private ArrayList<HashMap> books;
    private IView view;
    private Library library;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldCheckoutABookWhichHasTitle() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<IRentableType> books = new ArrayList<>();
        ArrayList<IRentableType> checkoutBooks = new ArrayList<>();
        books.add(book);
        Library library = new Library(books, checkoutBooks);
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem("Java", RentableType.BOOK, user);
        assertEquals("Thank you! Enjoy the BOOK\n", outContent.toString());

    }

    @Test
    public void shouldReturnACheckedOutBookWhichHasTitle() {
        Book book = new Book("Java","James Gosling","TMH");
        ArrayList<IRentableType> books = new ArrayList<>();
        ArrayList<IRentableType> checkoutBooks = new ArrayList<>();
        checkoutBooks.add(book);
        Library library = new Library(books, checkoutBooks);

        library.returnItem("Java", RentableType.BOOK);
        assertEquals("Thank you for returning the BOOK.\n", outContent.toString());

    }

    @Test
    public void shouldCheckoutAMovie() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> items = new ArrayList<>();
        ArrayList<IRentableType> checkoutItems = new ArrayList<>();
        items.add(movie);
        Library library = new Library(items, checkoutItems);
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem("Harry Potter 1", RentableType.MOVIE, user);
        assertEquals("Thank you! Enjoy the MOVIE\n", outContent.toString());
    }

    @Test
    public void shouldReturnAMovieWhichIsCheckoutAndIsValid() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> items = new ArrayList<>();
        ArrayList<IRentableType> checkoutItems = new ArrayList<>();
        checkoutItems.add(movie);
        Library library = new Library(items, checkoutItems);

        library.returnItem("Harry Potter 1", RentableType.MOVIE);
        assertEquals("Thank you for returning the MOVIE.\n", outContent.toString());

    }

    @Test
    public void shouldAddItemIssueToTheIssuedList() {
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> items = new ArrayList<>();
        ArrayList<IRentableType> checkoutItems = new ArrayList<>();
        items.add(movie);
        Library library = new Library(items, checkoutItems);

        library.checkoutItem("Harry Potter 1", RentableType.MOVIE, user);
        IssueDetail issueDetail = new IssueDetail(movie, user);
        ArrayList<IssueDetail> issueDetails = new ArrayList<>();
        issueDetails.add(issueDetail);

        assertEquals(issueDetails, library.getIssuedItemList());
    }

    @Test
    public void shouldGiveAIssueDetailForAItemNamePassed() {
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> items = new ArrayList<>();
        ArrayList<IRentableType> checkoutItems = new ArrayList<>();
        items.add(movie);
        Library library = new Library(items, checkoutItems);

        library.checkoutItem("Harry Potter 1", RentableType.MOVIE, new User("dablu", "123456", "123456789", "user", "user"));
        IssueDetail issueDetail = new IssueDetail(movie, user);
        ArrayList<IssueDetail> issueDetails = new ArrayList<>();
        issueDetails.add(issueDetail);

        assertEquals(issueDetail, library.getIssueDetail("Harry Potter 1"));
    }

    @Test
    public void shouldNotGiveNullExceptionForAIssueDetail() {
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> items = new ArrayList<>();
        ArrayList<IRentableType> checkoutItems = new ArrayList<>();
        items.add(movie);
        Library library = new Library(items, checkoutItems);

        ArrayList<IssueDetail> issueDetails = new ArrayList<>();

        assertNotNull(library.getIssueDetail("Harry Potter 1"));
    }
}
