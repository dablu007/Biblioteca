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
    public int execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.MOVIE);
        view.show();
        String bookName = new Inputs().getNameForCheckout();
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem(bookName, RentableType.MOVIE, user);
        return 0;
    }
}
