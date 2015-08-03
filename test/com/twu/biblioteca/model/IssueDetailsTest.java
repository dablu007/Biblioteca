package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IssueDetailsTest {

    @Test
    public void shouldListTheDetailsOfUserWithAParticularCheckoutBook() {
        IRentableType book = new Book("Java","James Gosling","TMH");
        User user = new User();
        IssueDetails issueDetails = new IssueDetails(book, user);

        assertEquals(user, issueDetails.isIssuedAgainst(book));
    }
}
