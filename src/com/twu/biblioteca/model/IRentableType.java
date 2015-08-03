package com.twu.biblioteca.model;

public interface IRentableType {

    boolean isAvilable(String name);
    RentableType getType();

    boolean isSameType(RentableType type);
}
