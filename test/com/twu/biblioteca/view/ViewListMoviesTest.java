package com.twu.biblioteca.view;

import com.twu.biblioteca.model.IRentableType;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Movie;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ViewListMoviesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldListAllTheMoviesAvailableInLibrary() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        ArrayList<IRentableType> availableMovies = new ArrayList<>();
        availableMovies.add(movie);
        Library library = new Library(availableMovies, new ArrayList<IRentableType>());
        ViewListMovies viewListMovies = new ViewListMovies(library);
        viewListMovies.show();

        String expectedList = "------------------------------Avilable Movies--------------------------\n"
                +String.format("%17s%27s%27s", "MovieName", "Director", "Year Of Release") + "\n" +
                String.format("%15s%29s%25s", movie.getMovieName(), movie.getDirector(), movie.getYearOfRelease())+
                "\n" +
                "----------------------------------------------------------------------\n";
        assertEquals(expectedList.toString(), outContent.toString());
    }
}
