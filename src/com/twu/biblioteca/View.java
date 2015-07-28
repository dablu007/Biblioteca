package com.twu.biblioteca;

public class View {
    public void showWelcomeMessage(){
        System.out.println("Welcome to The Bangalore Public Library");
    }

    public void showBook(Book book) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%s%17s%17s%27s","Book No.","BookName","Author","Publication"));
        System.out.println(book.getBookNo() + book.getBookName() + book.getAuthor() + book.getPublication());
    }
}
