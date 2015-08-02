package com.twu.biblioteca.model;


public class Movie implements IRentableType{
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

    public String getMovieName() {
        return movieName;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDirector() {
        return director;
    }

    public String getMovieRating() {
        return movieRating;
    }

    @Override
    public RentableType getType() {
        return RentableType.MOVIE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (movieName != null ? !movieName.equals(movie.movieName) : movie.movieName != null) return false;
        if (yearOfRelease != null ? !yearOfRelease.equals(movie.yearOfRelease) : movie.yearOfRelease != null)
            return false;
        if (director != null ? !director.equals(movie.director) : movie.director != null) return false;
        return !(movieRating != null ? !movieRating.equals(movie.movieRating) : movie.movieRating != null);

    }

    @Override
    public int hashCode() {
        int result = movieName != null ? movieName.hashCode() : 0;
        result = 31 * result + (yearOfRelease != null ? yearOfRelease.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (movieRating != null ? movieRating.hashCode() : 0);
        return result;
    }
}
