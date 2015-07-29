package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private Library library;
    private View view;

    public Menu(Library library,View view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(int command) {
        if (command == 1){
            this.library.showListOfBooks();
        }
        else if (command == 2){
            int bookno = getBookNoForCheckout();
            this.library.checkoutBook(bookno);
        }
        else if (command == 3){
            this.library.exit();
        }
        else {
            view.showInvalidMessage();
        }
    }
    private int getBookNoForCheckout() {
        int bookNoForCheckout = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bookNoForCheckout = Integer.parseInt(bufferedReader.readLine());
            return bookNoForCheckout;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookNoForCheckout;
    }
}
