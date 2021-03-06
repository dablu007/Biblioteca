package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;

public class ViewNotReturn implements IView {

    private RentableType type;

    public ViewNotReturn(RentableType type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("That is not a valid "+type+" to return");
    }
}
