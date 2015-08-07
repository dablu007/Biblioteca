package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.*;

import java.util.HashMap;

public class AdminMenuOptions {
    private HashMap menu;
    private Library library;
    private User user;

    public AdminMenuOptions(Library library, User user) {
        this.library = library;
        this.user = user;
        menu = new HashMap();
        IView viewListOfBooks = new ViewListOfBooks(library);
        IView listOfMovies = new ViewListMovies(library);
        ListBooks listBooks = new ListBooks(library, viewListOfBooks);
        CheckoutBook checkoutBook = new CheckoutBook(library, user);
        CheckoutMovie checkoutMovie = new CheckoutMovie(library, user);
        ReturnBook returnBook = new ReturnBook(library);
        ReturnMovie returnMovie = new ReturnMovie(library);
        Exit exit = new Exit(library);
        InvalidMessage invalidMessage = new InvalidMessage(new ViewInvalidMessage());
        ListUserInfo listUserInfo = new ListUserInfo(new ViewListUserInfo(user));
        ListMovies listMovies = new ListMovies(library, listOfMovies);
        IView viewListCheckoutBooks = new ViewListCheckoutBooks(library);
        IView viewListCheckoutMovies = new ViewListCheckoutMovies(library);
        ListCheckoutBooks listCheckoutBooks = new ListCheckoutBooks(library,viewListCheckoutBooks);
        ListCheckoutMovies listCheckoutMovies = new ListCheckoutMovies(library, viewListCheckoutMovies);
        IssuedList issuedList = new IssuedList(library);
        menu.put("1", listBooks);
        menu.put("2", checkoutBook);
        menu.put("3", returnBook);
        menu.put("4", listMovies);
        menu.put("5", checkoutMovie);
        menu.put("6", returnMovie);
        menu.put("7", listUserInfo);
        menu.put("8", listCheckoutBooks);
        menu.put("9", listCheckoutMovies);
        menu.put("10", issuedList);
        menu.put("11", exit);
        menu.put("12", invalidMessage);

    }

    public IOperation getOperation(String input){

        if (menu.containsKey(input))
            return (IOperation) menu.get(input);
        return (IOperation) menu.get("9");
    }
}
