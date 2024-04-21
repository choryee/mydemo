package ex09_JavaCoding_Quiz.melone2;

import ex09_JavaCoding_Quiz.melon.Predicate;
import ex09_JavaCoding_Quiz.melon2.Melon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class MelonTest01 {
    public static void main(String[] args) {
        List<Melon> list= Arrays.asList(
                new Melon("mac", 20, "NY"),
                new Melon("bak", 35, "OH"),
                new Melon("mac", 45, "ME")
        );

        List<Melon> newArr = filter(list, a->a.getType().equals("mac"));
        newArr.stream().forEach(System.out::println);

        System.out.println("-------------");
        list.stream().filter(b->b.getOrigin().equals("NY")).forEach(System.out::println);
        System.out.println(list.stream()
                //.map(Melon:: getWeight() //이건 틀림
                //.map(c -> c.getWeight()*2)
                .map(Melon::getType) // getType()매소드를 말함.
                .collect(Collectors.toList())
        );

        System.out.println("-------------");
        list.stream()
                .map(m->new Melon(m.getType(), m.getWeight()*2,m.getOrigin()))
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
