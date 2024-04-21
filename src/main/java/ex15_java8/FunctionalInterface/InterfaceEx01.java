package ex15_java8.FunctionalInterface;

public class InterfaceEx01 {

    public static void main(String[] args) {
        System.out.println(
//            add(new calculation<Integer>() {
//                @Override
//                public int addtion(Integer t1, Integer t2) {
//                    return t1+t2;
//                }
//            }, 2,3)

            add((a,b)->a+b, 2,3)
        );

    } //main

    private static <T> int add(calculation<T> calculation, T t1, T t2){
        return calculation.addtion(t1, t2);
    }

//    private static <T> int add(T t1, T t2){ <--- calculation<T> calculation를 매개변수로 안 주니, 사용 불가.
//        return calculation.a
//    }

    interface calculation<T>{
        int addtion(T t1, T t2); // 매소드에서 T형을 쓰고 싶은면, 위 클래스나 인터페이스에도 T형을 정의해줘야 한다.
    }
}
