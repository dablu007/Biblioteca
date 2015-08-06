package com.twu.biblioteca.view;

import com.twu.biblioteca.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ViewListCheckoutMoviesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldListAllTheCheckoutMoviesInLibrary() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> availableMovies = new ArrayList<>();
        availableMovies.add(movie);
        Library library = new Library(availableMovies, new ArrayList<IRentableType>());
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem("Harry Potter 1", RentableType.MOVIE, user);
        IView viewListCheckoutMovies = new ViewListCheckoutMovies(library);
        viewListCheckoutMovies.show();

        String expectedList = "Thank you! Enjoy the MOVIE\n"+
                "------------------------------Checkout Movies--------------------------\n"
                +String.format("%17s%27s%27s", "MovieName", "Director", "Year Of Release")+ "\n" +
                String.format("%15s%29s%25s", movie.getMovieName(), movie.getDirector(), movie.getYearOfRelease())+
                "\n" +
                "----------------------------------------------------------------------\n";
        assertEquals(expectedList.toString(), outContent.toString());
    }
}
