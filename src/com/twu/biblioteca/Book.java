package com.twu.biblioteca;


public class Book {
    private int bookNo;
    private String bookName;
    private String status;
    private String author;
    private String publication;
    private View view;

    public Book(int bookNo, String bookName, String status, String author, String publication) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.status = status;
        this.author = author;
        this.publication = publication;
        view = new View();
    }

    public void show(View view){
        view.showBook(bookNo, bookName, status, author, publication);
    }
}
