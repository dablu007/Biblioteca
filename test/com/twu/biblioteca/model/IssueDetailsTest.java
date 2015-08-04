package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class IssueDetailsTest {

    @Test
    public void shouldListTheDetailsOfUserWithAParticularCheckoutBook() {
        IRentableType book = new Book("Java","James Gosling","TMH");
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        IssueDetail issueDetail = new IssueDetail(book, user);

        assertEquals(user, issueDetail.isIssuedAgainst(book));
    }

    @Test
    public void shouldMatchTheTwoIssueDetailWithSameName() {
        IRentableType book = new Book("Java","James Gosling","TMH");
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        IssueDetail issueDetail = new IssueDetail(book, user);

        assertTrue(issueDetail.isEqual("Java"));
    }


}
