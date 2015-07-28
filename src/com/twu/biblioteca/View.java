package com.twu.biblioteca;

public class View {
    public void showWelcomeMessage(){
        System.out.println("Welcome to The Bangalore Public Library");
    }

    public void showBook(int bookNo, String bookName, String status, String author, String publication) {
        System.out.println("Book Name " + bookNo);
        System.out.println("Book No " + bookName);
        System.out.println("Status " + status);
        System.out.println("Author" + author);
        System.out.println("Publication" + publication);
    }
}
