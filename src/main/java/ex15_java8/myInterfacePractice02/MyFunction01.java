package ex15_java8.myInterfacePractice02;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Function;
import java.util.function.Supplier;

public class MyFunction01 {
    public static void main(String[] args) {
        /*
         * 1. (함수형 인터페이스 사용하지 않고, 내가 만들 경우) 내가 인터페이스 정의=> 안에 추상매소드만 선언
		 1-1. (함수형 인터페이스 사용시) 따로 선언 필요없이, 바로 밑에 2번으로.
         * 2. "인터페이스명 = new 인터페이스명" 으로, 위 추상매소드를 구체화함.
         * 3. "인터페이스명.매소드명" 형태로 사용함.
         * */
        Melon melonOriginal =new Melon("Gac", 20, "NY");
        System.out.println(creating.apply(melonOriginal));

        System.out.println(supplier.get());

    }//

    private static Function<Melon ,Melon> creating = new Function<Melon, Melon>() {
        @Override
        public Melon apply(Melon melon) {
            return new Melon(melon.getType(), melon.getWeight()*2, melon.getOrigin());
        }
    };
    private static Supplier<Melon> supplier = ()->new Melon("bak", 15, "OH");


}// class



@Data
@AllArgsConstructor
class Melon{
    private String type;
    private int weight;
    private String origin;

}