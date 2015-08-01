package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterBookName;

public class ReturnBook implements IOperation {
    private Library library;

    public ReturnBook(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        IView view = new ViewEnterBookName();
        view.show();
        String bookno = new Inputs().getBookName();
        library.returnBook(bookno);
    }
}
