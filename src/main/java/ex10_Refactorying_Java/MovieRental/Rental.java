package ex10_Refactorying_Java.MovieRental;

import ex10_Refactorying_Java.Movie.Movie;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "_movie 이름=" + _movie +
                ", _daysRented=" + _daysRented +
                '}';
    }
}
