package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterBookName;

public class CheckoutMovie implements IOperation{
    private final Library library;
    private final IView view;

    public CheckoutMovie(Library library, IView view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {
        IView view = new ViewEnterBookName();
        view.show();
        String bookName = new Inputs().getBookName();
        library.checkoutItem(bookName, RentableType.MOVIE);
    }
}
