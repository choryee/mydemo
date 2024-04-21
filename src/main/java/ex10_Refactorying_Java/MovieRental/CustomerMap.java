package ex10_Refactorying_Java.MovieRental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerMap {

    private Map<String, List> map=new HashMap<>();

    private List<Rental> rentalList=new ArrayList<>();

    public  void add(String name, List<Rental> list){
        map.put(name, list);
    }

    public void showAll(){

        for(List<Rental> rentals : map.values()){
            //String s1 = s;
            System.out.println("key : "+rentals);
        }
    }





}
