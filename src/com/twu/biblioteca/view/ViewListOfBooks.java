package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Formatter;

import java.util.ArrayList;

public class ViewListOfBooks implements IView{
    private Formatter formatter;
    public ViewListOfBooks(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%17s%17s%17s", "BookName", "Author", "Publication"));
        ArrayList<Book> books = formatter.format();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(String.format("%15s%19s%15s", book.getBookName(), book.getAuthor(), book.getPublication()));
            System.out.println("----------------------------------------------------------------------");
        }

    }
}
