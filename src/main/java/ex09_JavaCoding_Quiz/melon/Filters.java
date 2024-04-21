package ex09_JavaCoding_Quiz.melon;

import ex09_JavaCoding_Quiz.melon2.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    private   List<Melon> melons;

    public Filters(){
        this.melons=new ArrayList<>();
    }

   //List<Melon> melons=new ArrayList<>();

    public  List<Melon> filterByType(List<Melon> list, String type){
         for(Melon melon : list){
            if(melon.getType().equals(type)){
                melons.add(melon);
            }
        }
         return melons;
    }

    public List<Melon> filterMelons(List<Melon> lists, MelonPredicate predicate){
        for(Melon melon : lists ){
            if(predicate.test(melon)){
                melons.add(melon);
            }
        }
        return melons;
    }

    public <T> List<T> filter(List<T> list, Predicate<T> predicate){
        //public <T>에서의 <T>는 제네릭 메서드를 선언하는 부분입니다
        //여기 매소드에 선언하거나, 클래스명뒤에 선어해야.

        List<T> result=new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
