package com.twu.biblioteca;

public class View {
    public void showWelcomeMessage(){
        System.out.println("Welcome to The Bangalore Public Library");
    }

    public void showBook(Book book) {
        System.out.println("Book Name " + book.getBookNo());
        System.out.println("Book No " + book.getBookName());
        System.out.println("Author " + book.getAuthor());
        System.out.println("Publication " + book.getPublication() + "\n");
    }
}
