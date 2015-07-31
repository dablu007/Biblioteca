package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;

import java.util.ArrayList;

public class ViewListOfBooks implements IView{
    private Library library;
    public ViewListOfBooks(Library library) {
        this.library = library;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%17s%27s%27s", "BookName", "Author", "Publication"));
        ArrayList<Book> books = library.getAvailableBooks();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(String.format("%15s%29s%25s", book.getBookName(), book.getAuthor(), book.getPublication()));
            System.out.println("----------------------------------------------------------------------");
        }

    }
}
