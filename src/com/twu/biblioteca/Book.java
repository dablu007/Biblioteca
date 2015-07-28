package com.twu.biblioteca;


public class Book {
    private int bookNo;
    private String bookName;
    private String status;
    private String author;
    private String publication;

    public Book(int bookNo, String bookName, String status, String author, String publication) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.status = status;
        this.author = author;
        this.publication = publication;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public String getStatus() {
        return status;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }
}
