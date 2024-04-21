package ex09_JavaCoding_Quiz.melon2;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public static List<Melon> filterByType(List<Melon> melons, String type){
        List<Melon> result=new ArrayList<>();
        for (Melon melon : melons){
//            if(melon.getType() == type){
//                result.add(melon);
            if( melon !=null && type.equalsIgnoreCase(melon.getType())){
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight){
        List<Melon> result=new ArrayList<>();
        for ( Melon melon : melons){
            if(melon.getWeight() == weight){
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate){
        List<Melon> result=new ArrayList<>();
        for(Melon melon : melons){
            if(predicate.test(melon)){
                result.add(melon);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
    //public static  List<T> filter(List<T> list, Predicate<T> predicate){
        //메서드의 시그니처에서 <T>가 없어도 되나?
        //메서드의 시그니처에서 <T>가 사용되는 경우, 해당 메서드는 일반적인 타입을 다루기 위해 제네릭 방식을 사용하고 있다는 것을 나타냅니다.
        // 따라서 메서드 내부에서 T를 사용하여 일반적인 타입에 의존하는 코드를 작성할 수 있습니다. 이를 통해 메서드는 다양한 타입에 대해 재사용 가능하고, 컴파일 시에 타입 안전성을 보장할 수 있습니다.
        List<T> result=new ArrayList<T>();
        for( T t : list){
            if(predicate.test(t)){
                result.add(t);
           }
        }
        return result;
    }
}
