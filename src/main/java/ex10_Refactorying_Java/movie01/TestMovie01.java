package ex10_Refactorying_Java.movie01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestMovie01    {
    public static void main(String[] args) {

        System.out.println(MovieType.NEW_RELEASE.getName());

        Movie movieA = new Movie("Gone with", 1000, MovieType.REGULAR);
        Movie movieB= new Movie("Harry Porter", 1200, MovieType.NEW_RELEASE);
//        Movie movieC = createObject.apply("best", 1500);
//        Movie movieD = createObject.apply("great!!", 1300);
        Movie movieC = createMovie.apply("Little Prince", 1500, MovieType.CHILDREN);
        Movie movieD = createMovie.apply("Poverty", 1200, MovieType.REGULAR);

        Rental rental = new Rental(movieC, 2);
        Rental rental1= createRental.apply(movieB, 3);
        Rental rental2=createRental.apply(movieD, 4);
        List<Rental> rentalList =Arrays.asList(rental,rental1, rental2);

       // Customer customer = createCustomer.apply(rentalList,"JON");
        Customer customer=new Customer();
        customer.add(rental1);
        customer.getStatement();





    }//main

//    public static BiFunction<String, Integer, Movie> createObject = (a,b)->{
//        return new Movie(a,b );
//    };
    public static BiFunction<Movie, Integer, Rental> createRental=(movie, integer) -> {
        return new Rental(movie, integer);
    };
//    public static BiFunction<List<Rental>, String, Customer> createCustomer=(a,b)->{
//        return new Customer(a,b);
//    };
    public static ThreeFunction<String, Integer, Enum<MovieType>, Movie> createMovie =
        (t,a,b)->{
        return new Movie(t,a,b);
        };

}// public class

interface ThreeFunction<T,A,B,C> {
    C apply(T t, A a, B b);
}



