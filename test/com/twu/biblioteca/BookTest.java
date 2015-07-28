package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;


public class BookTest {
    @Test
    public void shouldShowABook() {
        Book book = new Book(1,"Java","available","James Gosling","TMH");
        View view = mock(View.class);

        book.show();
        view.showBook(1,"Java","available","James Gosling","TMH");
        Mockito.verify(view,atLeast(1)).showBook(1,"Java","available","James Gosling","TMH");
    }
}
