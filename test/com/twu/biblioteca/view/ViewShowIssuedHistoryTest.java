package com.twu.biblioteca.view;

import com.twu.biblioteca.model.IssueDetail;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewShowIssuedHistoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowTheNameOfUserAgainstWhichTheItemWasIssued() {
        Movie movie = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        IssueDetail issueDetail = new IssueDetail(movie, user);
        String name = "Harry Potter 1";
        IView view = new ViewShowIssuedHistory(issueDetail, name);

        view.show();
        String expectedList = "------------------------------Issued List--------------------------\n"+
                String.format("%17s%27s", "User Name", "Item Issued")+"\n" +
                String.format("%17s%27s", user.getUserName(), name)+"\n";
        assertEquals(expectedList, outContent.toString());
    }
}
