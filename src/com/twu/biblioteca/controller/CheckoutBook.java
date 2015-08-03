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
    public void execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.BOOK);
        view.show();
        String bookName = new Inputs().getNameForCheckout();
        library.checkoutItem(bookName, RentableType.BOOK);
    }

}
