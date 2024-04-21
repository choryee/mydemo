package ex15_java8.myInterfacePractice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFunction04 {
    public static void main(String[] args) {
        List<Melon1> lists= Arrays.asList(
                new Melon1("Gac", 10, "NY"),
                new Melon1("bak", 20, "OH"),
                new Melon1("Gac", 15, "NY"),
                new Melon1("cbd", 19, "FL"));

        System.out.println( filterByType("mac", lists, new GacMelonPredicate()) );//클래스라 new해줘야.
        System.out.println("--------");
        System.out.println( filterByType("", lists, bakMelonPredicate) ); //static이라 그냥 써줌.
        System.out.println("--------");
        System.out.println( filterByWeight(lists, getByWeight) );

    }//main

    private static List<Melon1> filterByType(String type, List<Melon1> list, MelonPredicate melonPredicate){
        List<Melon1> newList=new ArrayList<>();
        for(Melon1 melon : list){
            if(melonPredicate.test(melon)){// 매개변수MelonPredicate melonPredicate의 매소드 써줌.
                newList.add(melon);
            }
        }
        return newList;
    }

    private static List<Melon1> filterByWeight(List<Melon1> list, MelonPredicate melonPredicate){
        List<Melon1> newLists=new ArrayList<>();
        for( Melon1 melon : list){
            if(melonPredicate.test(melon)){
                newLists.add(melon);
            }
        }
        return newLists;
    }

    private static MelonPredicate bakMelonPredicate = new MelonPredicate() { //인터페이스로 바로 선언
        @Override
        public boolean test(Melon1 melon) {
            return "bak".equals(melon.getType());
        }
    };

    private static MelonPredicate getByWeight = i -> i.getWeight()>11; //인터페이스로 바로 선언

}//public class

class GacMelonPredicate implements MelonPredicate{ //클래스로 선언

    @Override
    public boolean test(Melon1 melon) {
        return "Gac".equals(melon.getType());
    }
}


interface MelonPredicate{
    boolean test(Melon1 melon);
}

@Data
@AllArgsConstructor
class Melon1{
    private String type;
    private int weight;
    private String origin;

}
