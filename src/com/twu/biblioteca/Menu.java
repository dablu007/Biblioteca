package com.twu.biblioteca;

public class Menu {
    private Library library;
    private View view;

    public Menu(Library library,View view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(String command) {
        if (command.equals("List Books"))
            this.library.showListOfBooks(view);

    }
}
