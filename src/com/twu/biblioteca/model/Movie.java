package com.twu.biblioteca.model;


public class Movie {
    private String movieName;
    private String yearOfRelease;
    private String director;
    private String movieRating;

    public Movie(String movieName, String yearOfRelease, String director, String movieRating) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.movieRating = movieRating;
    }

    public boolean hasName(String input) {
        return movieName.equals(input);
    }
}
