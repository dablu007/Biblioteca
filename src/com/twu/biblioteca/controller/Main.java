package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.*;

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
        ReturnBook returnBook = new ReturnBook(library);
        Exit exit = new Exit(library);
        InvalidMessage invalidMessage = new InvalidMessage(new ViewInvalidMessage());
        HashMap menuOptions = new HashMap();
        menuOptions.put("1", listBooks);
        menuOptions.put("2", checkoutBook);
        menuOptions.put("3", returnBook);
        menuOptions.put("4", exit);
        menuOptions.put("5", invalidMessage);
        while (true){
            optionsView.show();
            System.out.println("Enter Your Choice");
            option = scanner.next();
            if (menuOptions.containsKey(option)) {
                IOperation operation = (IOperation) menuOptions.get(option);
                operation.execute();
            }
            else{
                IOperation operation = (IOperation) menuOptions.get("5");
                operation.execute();
            }

        }
    }
}
