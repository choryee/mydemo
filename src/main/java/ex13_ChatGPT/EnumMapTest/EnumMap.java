package ex13_ChatGPT.EnumMapTest;

import java.util.HashMap;
import java.util.Map;

enum DrinkType{
    COLA,WATER,SODA
}
public class EnumMap {
    public static void main(String[] args) {
        // DrinkType.class는. 자바에서 클래스 리터럴(class literal)을 사용하는 방법 중 하나입니다.
        // 클래스 리터럴은. 클래스 자체를. 하나의 객체로. 나타내기 위한 특별한 표현입니다.
        // 클래스 리터럴을 사용하면 해당 클래스의 정보를 다룰 수 있습니다.
        Map<DrinkType, Integer> stocks=new java.util.EnumMap<>(DrinkType.class);

        stocks.put(DrinkType.COLA, 10);
        stocks.put(DrinkType.WATER, 5);
        stocks.put(DrinkType.SODA, 15);

        System.out.println(stocks.entrySet()); // [COLA=10, WATER=5, SODA=15]



    }
}
