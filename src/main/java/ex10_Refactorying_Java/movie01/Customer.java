package ex10_Refactorying_Java.movie01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Customer {
    private List<Rental> list;
    private String statement;

    Customer(){
        list=new ArrayList<>();
    }

    public void add(Rental rental){
        list.add(rental );
    }

    public String getStatement(){
        StringBuffer sb=new StringBuffer("statement is ");
        String result = sb.toString();

       List<Integer>  lists =
               list.stream()
                .map(Rental::getList)
                .map(a->a.get(0).getPriceCode())
                .collect(Collectors.toList());
        System.out.println(lists.get(0));



        return result;
    }
}
