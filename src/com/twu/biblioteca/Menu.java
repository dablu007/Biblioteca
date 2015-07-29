package com.twu.biblioteca;


public class Menu {
    private Library library;
    private View view;
    private Inputs inputs;
    public Menu(Library library,View view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(int command) {
        if (command == 1){
            this.library.showListOfBooks();
        }
        else if (command == 2){
            int bookno = new Inputs().getBookNoForCheckout();
            this.library.checkoutBook(bookno);
        }
        else if (command == 3){
            this.library.exit();
        }
        else {
            view.showInvalidMessage();
        }
    }
}
