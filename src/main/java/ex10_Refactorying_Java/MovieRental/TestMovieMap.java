package ex10_Refactorying_Java.MovieRental;

import ex10_Refactorying_Java.Movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class TestMovieMap {
    public static void main(String[] args) {

        Rental rental1=new Rental(new Movie("king", 2),3);
        Rental rental2=new Rental(new Movie("Little", 1),2);
        List<Rental> list =new ArrayList<>();
        list.add(rental1);
        list.add(rental2);

        CustomerMap customerMap=new CustomerMap();
        customerMap.add("kim", list);
        customerMap.showAll();
    }
}
