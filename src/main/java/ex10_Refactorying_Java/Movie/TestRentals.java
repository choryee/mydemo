package ex10_Refactorying_Java.Movie;

public class TestRentals {

    public static void main(String[] args) {
        //Movie movie=new Movie("King", 2);
        Rental rental1=new Rental(new Movie("Prince", 0), 4);
        Rental rental2=new Rental(new Movie("Little King", 1), 7);

        Customer customer=new Customer("Park");
        customer.addRental(rental1);
        customer.addRental(rental2);




    }
}
