package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;

public class ListBooks implements IOperation {
    private IView view;
    private Library library;

    public ListBooks(Library library, IView view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public void execute() {
        view.show();
    }
}
