package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterNameForCheckout;

public class ReturnMovie implements IOperation {
    private Library library;

    public ReturnMovie(Library library) {
        this.library = library;
    }

    @Override
    public int execute() {
        IView view = new ViewEnterNameForCheckout(RentableType.MOVIE);
        view.show();
        String movieName = new Inputs().getNameForCheckout();
        library.returnItem(movieName, RentableType.MOVIE);
        return 0;
    }
}
