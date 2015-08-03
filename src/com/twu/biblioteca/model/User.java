package com.twu.biblioteca.model;

public class User {
    private String userId;
    private String password;
    private String userName;
    private String phoneNumber;
    private String libraryNumber;

    public User() {
        this.userId = "dablu";
        this.password = "123456";
        this.userName = "Dablu";
        this.phoneNumber = "123456789";
        this.libraryNumber = "LIB001";
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        return !(password != null ? !password.equals(user.password) : user.password != null);

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public boolean isValid(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }
}
