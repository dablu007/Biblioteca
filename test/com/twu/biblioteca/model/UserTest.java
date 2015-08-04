package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class UserTest {

    @Test
    public void shouldCheckForValidUser() {
        User user = new User("LIB001","123456","123456789","Dablu", "user");

        assertTrue(user.isValid("LIB001", "123456"));
    }

    @Test
    public void isValidUserWithRoleAsUser() {
        User user = new User("LIB001","123456","123456789","Dablu", "user");

        assertTrue(user.isNotAdmin());
    }

    @Test
    public void isValidUserWithRoleAsAdmin() {
        User user = new User("LIB001","123456","123456789","Dablu", "admin");

        assertFalse(user.isNotAdmin());
    }
}
