package com.twu.biblioteca;

public class WelcomeMessage implements IView{

    @Override
    public void show() {
        System.out.println("Welcome to The Bangalore Public Library");
    }
}
