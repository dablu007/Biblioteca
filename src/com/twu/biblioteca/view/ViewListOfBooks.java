package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Formatter;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewListOfBooks implements IView{
    private Formatter formatter;
    public ViewListOfBooks(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%s%17s%17s%27s", "Book No.", "BookName", "Author", "Publication"));
        ArrayList<HashMap> books = formatter.format();
        for (int i = 0; i < books.size(); i++) {
            HashMap book = books.get(i);
            System.out.println(String.format("%s%20s%27s%17s", book.get("bookNo"), book.get("bookName"), book.get("author"),
                    book.get("publication")));
            System.out.println("----------------------------------------------------------------------");
        }

    }
}
