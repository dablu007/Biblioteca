package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class UserTest {

    @Test
    public void shouldCheckForValidUser() {
        User user = new User();

        assertTrue(user.isValid("dablu", "123456"));
    }
}
