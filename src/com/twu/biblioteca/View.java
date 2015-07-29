package com.twu.biblioteca;

import java.util.HashMap;


public class View {

    public void showWelcomeMessage(){
        System.out.println("Welcome to The Bangalore Public Library");
    }

    public void showBook(HashMap book) {
        System.out.println(String.format("%s%20s%27s%17s", book.get("bookNo"), book.get("bookName"), book.get("author"),
                book.get("publication")));
        System.out.println("----------------------------------------------------------------------");
    }

    public void showListBookMessage() {
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%s%17s%17s%27s", "Book No.", "BookName", "Author", "Publication"));
    }

    public void showOptions() {
        System.out.println("1.List Books");
        System.out.println("2.Checkout a Book");
        System.out.println("3.Quit");
    }

    public void showInvalidMessage() {
        System.out.println("Select a valid option!");
    }

    public void showCheckOutMessage() {
        System.out.println("Books Successfully Checkout");
    }
}
