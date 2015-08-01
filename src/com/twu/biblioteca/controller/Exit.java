package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;

public class Exit implements IOperation {
    private Library library;

    public Exit(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.exit();
    }
}
