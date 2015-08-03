package com.twu.biblioteca.model;

public class IssueDetails {
    private IRentableType type;
    private User user;

    public IssueDetails(IRentableType type, User user) {
        this.type = type;
        this.user = user;
    }

    public User isIssuedAgainst(IRentableType name) {
        if (this.type.equals(name))
            return this.user;
        return null;
    }
}
