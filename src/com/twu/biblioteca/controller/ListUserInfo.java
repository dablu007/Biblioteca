package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;

public class ListUserInfo implements IOperation {
    private IView view;

    public ListUserInfo(IView view) {
        this.view = view;
    }

    @Override
    public int execute() {
        view.show();
        return 0;
    }
}
