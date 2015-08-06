package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewInvalidMessage;
import com.twu.biblioteca.view.ViewListCheckoutBooks;
import com.twu.biblioteca.view.ViewListCheckoutMovies;

import java.util.HashMap;

public class AdminMenuOptions {
    private HashMap menu;
    private Library library;
    private User user;

    public AdminMenuOptions(Library library, User user) {
        this.library = library;
        this.user = user;
        menu = new HashMap();
        IView viewListCheckoutBooks = new ViewListCheckoutBooks(library);
        IView viewListCheckoutMovies = new ViewListCheckoutMovies(library);
        ListCheckoutBooks listCheckoutBooks = new ListCheckoutBooks(library,viewListCheckoutBooks);
        ListCheckoutMovies listCheckoutMovies = new ListCheckoutMovies(library, viewListCheckoutMovies);
        Exit exit = new Exit(library);
        InvalidMessage invalidMessage = new InvalidMessage(new ViewInvalidMessage());
        IssuedList issuedList = new IssuedList(library);
        menu.put("1", listCheckoutBooks);
        menu.put("4", exit);
        menu.put("9", invalidMessage);

    }

    public IOperation getOperation(String input){

        if (menu.containsKey(input))
            return (IOperation) menu.get(input);
        return (IOperation) menu.get("9");
    }
}
