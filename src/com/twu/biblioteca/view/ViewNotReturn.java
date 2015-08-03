package com.twu.biblioteca.view;

public class ViewNotReturn implements IView {

    @Override
    public void show() {
        System.out.println("That is not a valid book to return");
    }
}
