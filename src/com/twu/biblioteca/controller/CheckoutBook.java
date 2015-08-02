package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterBookName;

public class CheckoutBook implements IOperation {

    private Library library;

    public CheckoutBook(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        IView view = new ViewEnterBookName();
        view.show();
        String bookName = new Inputs().getBookName();
        library.checkoutItem(bookName);
    }

}
