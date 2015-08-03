package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterNameForCheckout;

public class ReturnBook implements IOperation {
    private Library library;

    public ReturnBook(Library library) {
        this.library = library;
    }

    @Override
    public int execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.BOOK);
        view.show();
        String bookno = new Inputs().getNameForCheckout();
        library.returnItem(bookno, RentableType.BOOK);
        return 0;
    }
}
