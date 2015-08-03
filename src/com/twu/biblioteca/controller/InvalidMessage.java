package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;

public class InvalidMessage implements IOperation {

    private IView view;

    public InvalidMessage(IView view) {
        this.view = view;
    }

    @Override
    public int execute() {
        view.show();
        return 0;
    }
}
