package ex15_java8.myInterfacePractice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyFunction03 {
    public static void main(String[] args) {
        List<Melon> list= Arrays.asList(new Melon("mac", 10, "NY"),
                new Melon("bak", 20, "OH"), new Melon("mac", 15, "NY"));

        changing3(list);

        List<Melon> newList17= filter(list, i->i.getWeight()>17);

        List<Melon> newListByOrigin =
                list.stream()
                        .filter(i->i.getOrigin().equals("NY"))
                        .collect(Collectors.toList());
                        //.forEach(System.out::println);
        System.out.println(newListByOrigin.toString());

    }//main

    private static void changing1(List<Melon> list, Function<Melon, Melon> f ){
        list.stream()
                .map(doublePrice)
                .forEach(System.out::println);
    }
    private static void changing2(List<Melon> list, Function<Melon, Melon> f ){
        list.stream()
                .map(i->new Melon(i.getType(), i.getWeight()*3, i.getOrigin()))
                .forEach(System.out::println);
    }

    private static void changing3(List<Melon> list){
        list.stream()
                .map(i->new Melon(i.getType(), i.getWeight()*3, i.getOrigin()))
                .forEach(System.out::println);
    }

    private static Function<Melon, Melon> doublePrice = new Function<Melon, Melon>() {
        @Override
        public Melon apply(Melon melon) {
            return new Melon(melon.getType(), melon.getWeight()*2, melon.getOrigin());
        }
    };

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}




@Data
@AllArgsConstructor
class Melon{
    private String type;
    private int weight;
    private String origin;

}
