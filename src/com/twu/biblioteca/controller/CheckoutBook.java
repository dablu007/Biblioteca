package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterNameForCheckout;

public class CheckoutBook implements IOperation {

    private Library library;

    public CheckoutBook(Library library, User user) {
        this.library = library;
    }

    @Override
    public int execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.BOOK);
        view.show();
        String bookName = new Inputs().getNameForCheckout();
        User user = new User("LIB001","123456","123456789","Dablu", "user");
        library.checkoutItem(bookName, RentableType.BOOK, user);
        return 0;
    }

}
