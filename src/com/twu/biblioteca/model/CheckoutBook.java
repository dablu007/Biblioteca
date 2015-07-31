package com.twu.biblioteca.model;

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
        library.checkoutBook(bookName);
    }
}
