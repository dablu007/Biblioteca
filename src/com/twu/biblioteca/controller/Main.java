package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewListOfBooks;
import com.twu.biblioteca.view.ViewShowOptions;
import com.twu.biblioteca.view.ViewWelcomeMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IView welcomeView = new ViewWelcomeMessage();
        Inputs inputs = new Inputs();
        ArrayList<Book> books = inputs.addBooks();
        Library library = new Library(books, new ArrayList<Book>());
        IView viewListOfBooks = new ViewListOfBooks(library);
        IView optionsView = new ViewShowOptions();
        welcomeView.show();
        String  option;

        ListBooks listBooks = new ListBooks(library, viewListOfBooks);
        CheckoutBook checkoutBook = new CheckoutBook(library);
        HashMap menuOptions = new HashMap();
        menuOptions.put("1", listBooks);
        menuOptions.put("2", checkoutBook);
        while (true){
            optionsView.show();
            System.out.println("Enter Your Choice");
            option = scanner.next();
//            Menu menu = new Menu(library, listBooks);
            IOperation operation = (IOperation) menuOptions.get(option);
            operation.execute();

//            menu.executeCommand(option);
        }
    }
}
