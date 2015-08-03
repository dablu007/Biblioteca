package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;

public class ShowUserInfo implements IOperation {

    private IView view;

    public ShowUserInfo(IView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.show();
    }
}
