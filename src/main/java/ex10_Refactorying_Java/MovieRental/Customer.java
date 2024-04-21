package ex10_Refactorying_Java.MovieRental;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental rental){
        _rentals.addElement(rental);
    }

    public String getName(){
        return _name;
    }

    public  String statement(){
    // Movie. title, priceCode
        //public static final int CHILDREN=2; *2
        //    public static final int REGULAR=0; *1
        //    public static final int NEW_RELEASE=1; *3
    // Rental. Movie, dayRented

        int total=0;
        int amount =0;
        int credit=0;
        String result=getName()+" 고객님의 대여기록: \n";

        for(int i=0; i<_rentals.size(); i++){
            Rental each= (Rental) _rentals.get(i);
            //System.out.println(rental.get_movie().get_title());

          //  Rental rental=_rentals.iterator();

            //비디오 종류별 대여료 계산

            amount=amountFor(each);

//            if(Movie.CHILDREN == rental.get_movie().get_priceCode()){
//                amount=rental.get_daysRented()*2;
//                total+=amount;
//               // System.out.println(total);
//                title=rental.get_movie().get_title();
//
//            }else if(Movie.REGULAR ==rental.get_movie().get_priceCode()){
//                amount=rental.get_daysRented()*3;
//                total+=amount;
//                title=rental.get_movie().get_title();
//            }else if(Movie.NEW_RELEASE == rental.get_movie().get_priceCode()){
//                amount=rental.get_daysRented()*1;
//                total+=amount;
//                title=rental.get_movie().get_title();
//                credit++;
//            }
             total+=amount;
             result+="이번에 대여하는 비디오 이름은  "+each.get_movie().get_title()+"이고, 대여로는 "+String.valueOf(total);
        }// --for

        //적입 포인트를 1 증가

        //이번에 대여하는 비디오 이름와 대여료를 출력
//        System.out.println(title);
//        System.out.println(total);


        return result;

        // 현재까지 누적된 총 대여료

    }

    private int amountFor(Rental each){
        int amount=0;
        switch (each.get_movie().get_priceCode()){
            case Movie.CHILDREN:
                amount=each.get_daysRented()*2;
               // total+=amount;
                // System.out.println(total);
                //title=each.get_movie().get_title();
            case Movie.REGULAR:
                amount=each.get_daysRented()*3;
               // total+=amount;
               // title=each.get_movie().get_title();
            case Movie.NEW_RELEASE:
                amount=each.get_daysRented()*1;
               // total+=amount;
               // title=each.get_movie().get_title();
              //  credit++;
        }
        return amount;
    }


}
