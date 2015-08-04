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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IssueDetails that = (IssueDetails) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return !(user != null ? !user.equals(that.user) : that.user != null);

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
