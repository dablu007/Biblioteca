package com.twu.biblioteca.view;

import com.twu.biblioteca.model.*;

import java.util.ArrayList;

public class ViewListCheckoutMovies implements IView {
    private Library library;

    public ViewListCheckoutMovies(Library library) {
        this.library = library;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Checkout Movies--------------------------");
        System.out.println(String.format("%17s%27s%27s", "MovieName", "Director", "Year Of Release"));
        ArrayList<IRentableType> availableList = library.getCheckoutList();
        ArrayList<Movie> movies = new ArrayList<>();
        for (IRentableType object: availableList){
            if (object.getType() == RentableType.MOVIE)
                movies.add((Movie) object);
        }
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println(String.format("%15s%29s%25s", movie.getMovieName(), movie.getDirector(),
                    movie.getYearOfRelease()));
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
