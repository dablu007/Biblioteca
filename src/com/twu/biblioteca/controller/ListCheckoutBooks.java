package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;

public class ListCheckoutBooks implements IOperation {

    private final Library library;
    private final IView view;

    public ListCheckoutBooks(Library library, IView view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public int execute() {
        view.show();
        return 0;
    }
}
