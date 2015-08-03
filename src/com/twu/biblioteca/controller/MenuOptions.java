package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewInvalidMessage;
import com.twu.biblioteca.view.ViewListMovies;
import com.twu.biblioteca.view.ViewListOfBooks;
import java.util.HashMap;


public class MenuOptions {
    private HashMap menu;
    private Library library;
    private User user;

    public MenuOptions(Library library, User user) {
        this.library = library;
        this.user = user;
        menu = new HashMap();
        IView viewListOfBooks = new ViewListOfBooks(library);
        IView listOfMovies = new ViewListMovies(library);
        ListBooks listBooks = new ListBooks(library, viewListOfBooks);
        CheckoutBook checkoutBook = new CheckoutBook(library, user);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, user);
        ReturnBook returnBook = new ReturnBook(library);
        Exit exit = new Exit(library);
        InvalidMessage invalidMessage = new InvalidMessage(new ViewInvalidMessage());
        ListMovies listMovies = new ListMovies(library, listOfMovies);
        menu.put("1", listBooks);
        menu.put("2", checkoutBook);
        menu.put("3", returnBook);
        menu.put("4", listMovies);
        menu.put("5", checkoutMovie);
        menu.put("6", exit);
        menu.put("7", invalidMessage);

    }

    public IOperation getOperation(String input){

        if (menu.containsKey(input))
            return (IOperation) menu.get(input);
        return (IOperation) menu.get("7");
    }
}
