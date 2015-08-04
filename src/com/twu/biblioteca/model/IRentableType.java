package com.twu.biblioteca.model;

public interface IRentableType {

    boolean isAvilable(String name);
    RentableType getType();
    boolean isEqual(String name);
    boolean isSameType(RentableType type);
}
