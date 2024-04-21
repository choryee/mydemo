package ex15_java8.myInterfacePractice;

import ex15_java8.FunctionalInterface.FunctionInterfaceEx02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        FunctionInterfaceEx02.Order order = new FunctionInterfaceEx02.Order(
                1L, "order-123", Arrays.asList(
                        new FunctionInterfaceEx02.OrderedItem(
                                1L, new FunctionInterfaceEx02.Product(
                                        2L, "apple", new BigDecimal("20.00")),3))
        );
        FunctionInterfaceEx02.Product productA=new FunctionInterfaceEx02.Product(1L, "apple", new BigDecimal("20"));
        FunctionInterfaceEx02.Product productB=new FunctionInterfaceEx02.Product(2L, "pineapple", new BigDecimal("55"));
        FunctionInterfaceEx02.Product productC=new FunctionInterfaceEx02.Product(3L, "orange", new BigDecimal("96"));
        List<FunctionInterfaceEx02.Product> list = Arrays.asList(productA, productB, productC);

        List<FunctionInterfaceEx02.Product> filteredList = filter(list, product -> product.getPrice().compareTo(new BigDecimal("20"))>0);
        System.out.println("filteredList>> " + filteredList);
    }

    public static void moreThan30(){

    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result=new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }


}
