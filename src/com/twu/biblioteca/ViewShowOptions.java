package com.twu.biblioteca;

public class ViewShowOptions implements IView {

    @Override
    public void show() {
        System.out.println("1.List Books");
        System.out.println("2.Checkout a Book");
        System.out.println("3.Quit");
    }
}
