package com.twu.biblioteca.model;


import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterBookNo;
import com.twu.biblioteca.view.ViewInvalidMessage;

public class Menu {
    private Library library;
    private IView view;

    public Menu(Library library,IView view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(Integer command) {
        if (command == null)
            return;
        else if (command == 1){
            view.show();
        }
        else if (command == 2){
            view = new ViewEnterBookNo();
            view.show();
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
