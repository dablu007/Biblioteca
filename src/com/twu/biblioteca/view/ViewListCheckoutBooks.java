package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.IRentableType;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;

import java.util.ArrayList;

public class ViewListCheckoutBooks implements IView{

    private Library library;

    public ViewListCheckoutBooks(Library library) {
        this.library = library;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Checkout Books--------------------------");
        System.out.println(String.format("%17s%27s%27s", "BookName", "Author", "Publication"));
        ArrayList<IRentableType> availableList = library.getCheckoutList();
        ArrayList<Book> books = new ArrayList<>();
        for (IRentableType object: availableList){
            if (object.getType() == RentableType.BOOK)
                books.add((Book) object);
        }
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(String.format("%15s%29s%25s", book.getBookName(), book.getAuthor(), book.getPublication()));
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
