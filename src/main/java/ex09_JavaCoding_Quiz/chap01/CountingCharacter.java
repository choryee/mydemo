package ex09_JavaCoding_Quiz.chap01;

import org.checkerframework.checker.units.qual.K;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CountingCharacter {
    public static void main(String[] args) {
        System.out.println( countChar("banana") );

    }//main
            // 하나씩 들어오는 ch가 키가 됨. 밑처럼, 람다식으로만 써도, 이게 BiFunction임을 자동으로 인식함.
            //compute 메서드는 주어진 키에 대한 매핑 값을 계산하고, 그 결과를 맵에 저장합니다. 이 메서드는 람다 표현식을 사용하여 매핑을 업데이트할 수 있습니다.
            // 아래에 compute 메서드를 다양한 예시와 함께 설명하겠습니다.
    public static Map<Character, Integer> countChar(String str){
        Map<Character, Integer> result=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : v + 1 );
            //result.compute(ch, valueChanged.apply(ch, ));

        }
        return result;
    }

//    public static BiFunction<Character, Integer, Integer> valueChanging= new BiFunction<Character, Integer, Integer>() {
//    @Override
//    public Integer apply(Character character, Integer integer) {
//        return (ch, (k, v) -> (v == null) ? 1 : v + 1 );
//    }
//};
//    public static <k, v> void changing(){ //public <T>에서의 <T>는 제네릭 메서드를 선언하는 부분입니다
//        Character k;
//        valueChanged().apply(k);
//
//    }


}


