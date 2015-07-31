package com.twu.biblioteca.model;


public class Book {
    private String bookName;
    private String author;
    private String publication;

    public Book(String bookName, String author, String publication) {
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
    }

    public boolean hasTitle(String name) {
        return bookName.equals(name);
    }
}
