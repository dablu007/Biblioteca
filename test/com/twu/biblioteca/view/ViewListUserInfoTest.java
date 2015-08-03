package com.twu.biblioteca.view;

import com.twu.biblioteca.model.User;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewListUserInfoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowTheUserInfoForTheCurrentlyLoggedInUser() {
        User user = new User();
        IView view = new ViewListUserInfo(user);

        String expectedList = "------------------------------User Details--------------------------\n"
                +String.format("%17s%27s%27s", "UserName", "Phone Number", "Library Number") +"\n" +
                String.format("%15s%29s%25s", user.getUserName(), user.getPhoneNumber(), user.getLibraryNumber())+
                "\n" +
                "----------------------------------------------------------------------\n";

        view.show();
        assertEquals(expectedList, outContent.toString());
    }
}
