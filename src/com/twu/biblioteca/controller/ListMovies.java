package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;

public class ListMovies implements IOperation {
    private Library library;
    private IView view;

    public ListMovies(Library library,IView view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public int execute() {
        view.show();
        return 0;
    }
}
