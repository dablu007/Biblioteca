package com.twu.biblioteca.view;

public class ViewNotCheckoutBook implements IView {

    @Override
    public void show() {
        System.out.println("That book is not available");
    }
}
