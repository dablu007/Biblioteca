package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterNameForCheckout;

public class CheckoutMovie implements IOperation{
    private Library library;
    private User user;

    public CheckoutMovie(Library library, User user) {
        this.library = library;
        this.user = user;
    }

    @Override
    public void execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.MOVIE);
        view.show();
        String bookName = new Inputs().getNameForCheckout();
        library.checkoutItem(bookName, RentableType.MOVIE);
    }
}
