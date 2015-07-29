package com.twu.biblioteca;

public class Menu {
    private Library library;
    private View view;

    public Menu(Library library,View view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(int command) {
        if (command == 1)
            this.library.showListOfBooks(view);
        else if (command == 2)
            this.library.exit();
        else
            view.showInvalidMessage();
    }
}
