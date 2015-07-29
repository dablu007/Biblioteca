package com.twu.biblioteca;


public class Menu {
    private Library library;
    private IView view;

    public Menu(Library library,IView view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(int command) {
        if (command == 1){
            view.show();
        }
        else if (command == 2){
            int bookno = new Inputs().getBookNoForCheckout();
            this.library.checkoutBook(bookno);
        }
        else if (command == 3){
            this.library.exit();
        }
        else {
            view = new ViewInvalidMessage();
            view.show();
        }
    }
}
