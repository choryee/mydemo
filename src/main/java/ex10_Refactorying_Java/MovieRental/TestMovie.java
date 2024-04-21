package ex10_Refactorying_Java.MovieRental;

import ex10_Refactorying_Java.Movie.Movie;

public class TestMovie {
    public static void main(String[] args) {
        Customer customer=new Customer("Kim");
        customer.addRental(new Rental(new Movie("king", 2), 3));
        //customer.addRental(new Rental(new Movie("Prince", 1), 4));
        //customer.addRental(new Rental(new Movie("Little", 0), 5));
        customer.addRental(new Rental(new Movie("Little", 1), 5));


        System.out.println(customer.statement());


    }


}
