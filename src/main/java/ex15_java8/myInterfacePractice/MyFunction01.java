package ex15_java8.myInterfacePractice;

import ex09_JavaCoding_Quiz.melon.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFunction01 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,7,8,10,11);

        List<Integer> newArr=new ArrayList<>();

        newArr = list.stream().filter(i->i>3).collect(Collectors.toList());
        newArr.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(filter(list, a-> a>8));

        System.out.println("----------------");
        list.stream()
                .map(b-> b*2)
                .forEach(System.out::println);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> newArray=new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                newArray.add(t);
            }
        }
        return newArray;
    }
}
