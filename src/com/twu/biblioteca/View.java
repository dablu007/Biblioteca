package com.twu.biblioteca;

import java.util.ArrayList;

public class View {
    public void showWelcomeMessage(){
        System.out.println("Welcome to The Bangalore Public Library");
    }

    public void showBook(ArrayList book) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%s%17s%17s%27s", "Book No.", "BookName", "Author", "Publication"));
        System.out.println(String.format("%s%20s%27s%17s", book.get(0), book.get(1), book.get(3), book.get(4)));
    }
}
