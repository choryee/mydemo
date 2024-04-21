package ex15_java8.FunctionalInterface;

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        //6강. 12'00
        //- **메서드:** `R apply(T t)`
        //   - 값을 변환하는 역할을 하는 인터페이스로, 입력값을 받아 원하는 출력값으로 변환할 때 사용됩니다.

//        println(1, 2, 3, new Function3<Integer, Integer, Integer, String>() {
//            @Override
//            public String apply(Integer integer, Integer integer2, Integer integer3) {
//                return null;
//            }
//        });

        println(1,"A",3, (i1,i2,i3) -> String.valueOf(i1+i2+i3));
        println(3,4,5, FunctionalInterfaceEx::converter);

    }
    private static  <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3 , Function3 <T1, T2,T3, String> function){
        // String result = function.apply(t1,t2,t3);
        System.out.println( function.apply(t1,t2,t3) );
    }

    private static <T1 extends Number, T2 extends Number, T3 extends Number> String converter (T1 t1, T2 t2, T3 t3) {
        double result = t1.doubleValue() + t2.doubleValue() + t3.doubleValue();
        return String.valueOf(result);
    }

}// FunctionalInterfaceEx
interface Function3<T1,T2,T3, R>{ //자바의 Function인터페이스를 직접 만든 것.
    R apply(T1 t1, T2 t2, T3 t3);
}

