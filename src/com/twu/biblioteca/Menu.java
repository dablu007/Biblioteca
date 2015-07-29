package com.twu.biblioteca;


public class Menu {
    private Library library;
    private View view;
    private Inputs inputs;
    private IView viewBookList;

    public Menu(Library library,IView view) {
        this.library = library;
        this.viewBookList = view;
    }

    public Menu(IView view) {
        viewBookList = view;
    }

    public Menu(Library library, View view) {

    }

    public void executeCommand(int command) {
        if (command == 1){
            viewBookList.show();
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
