package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewListOfBooks;
import com.twu.biblioteca.view.ViewShowOptions;
import com.twu.biblioteca.view.ViewWelcomeMessage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IView welcomeView = new ViewWelcomeMessage();
        Inputs inputs = new Inputs();
        ArrayList<Book> books = inputs.addBooks();
        Library library = new Library(books, new ArrayList<Book>());
        IView listBooks = new ViewListOfBooks(library);
        IView optionsView = new ViewShowOptions();
        welcomeView.show();
        String  option;

        while (true){
            optionsView.show();
            System.out.println("Enter Your Choice");
            option = scanner.next();
            Menu menu = new Menu(library, listBooks);
            menu.executeCommand(option);
        }
    }
}
