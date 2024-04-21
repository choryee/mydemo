package ex10_Refactorying_Java.MovieRental;

public class Movie {

// priceCode
    public static final int CHILDREN=2;
    public static final int REGULAR=0;
    public static final int NEW_RELEASE=1;
    private String _title;
    private int _priceCode;

    Movie(String title, int priceCode){
        this._title=title;
        this._priceCode=priceCode;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "_title='" + _title + '\'' +
                ", _priceCode=" + _priceCode +
                '}';
    }
}
