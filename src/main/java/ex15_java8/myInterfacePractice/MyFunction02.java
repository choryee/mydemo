package ex15_java8.myInterfacePractice;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class MyFunction02 {
    public static void main(String[] args) {
        sumNumStartEnd.accept(3,20);
        System.out.println("\n-------------");
        isEvenNumber.accept(3, 17, (a) -> a % 2 == 0);
    }

    //시작값과 종료값 2개의 입력값을 받는 함수이다.짝수출력.
//  public static BiConsumer<Integer, Integer> sumNumber(int start, int end){
//        for(int n=start; n<end; n++){
//            if(n % 2==0){
//                System.out.println(n);
//            }
//        }
//  }
    public static BiConsumer<Integer, Integer> sumNumStartEnd
        = (start, end)->{
        for(int n=start; n<end; n++){
            if(n % 2==0){
                System.out.print(n+" ");
            }
        }
    };

interface ThreeConsumer<T1,T2,T3>{
    void accept(T1 t1, T2 t2, T3 t3);
}

    // BiConsumer를 이용하여 시작값, 종료값, 조건을 받아 짝수 출력
    public static ThreeConsumer<Integer, Integer, Predicate<Integer>> isEvenNumber
            = (start, end, predicate) -> {
        for (int n = start; n < end; n++) {
            // 조건을 만족하는 경우 출력
            if (predicate.test(n)) {
                System.out.print(n+" ");
            }
        }
    };

}
