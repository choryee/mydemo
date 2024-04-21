package ex15_java8.FunctionalInterface;

import java.util.function.Function;

public class MethodReferenceEx {
    //11강. 뒷 부분은 작성항 함.
    public static void main(String[] args) {
        methodReference01(); // 같은 클래스안에 있으므로, MethodReferenceEx.methodReference01();할 필요 없다.

    }

    private static void methodReference01(){
        //01. testFirstClassFunc01를 스트림으로 사용하는 것.
        System.out.println( testFirstClassFunc01(3, i->String.valueOf(i*2)) );

        //02. testFirstClassFunc01사용 위해, 매소드를 매개변수로 전달하려는 것.
        System.out.println( testFirstClassFunc01(3, MethodReferenceEx::doubleThenToString));

        System.out.println( getDoubleThenToStringWithLamda().apply(3) );
    }


    private static String doubleThenToString(int i){
        return String.valueOf(i*2);
    }
    private static String testFirstClassFunc01(int n, Function<Integer, String> f){
        // 11강, 09'00.
        // JS처럼 자바에서 함수를 리턴으로 넘길수 있는지 확인 하는 것.
        return "The result is "+ f.apply(n);
    }

    private static Function<Integer, String> getDoubleThenToStringWithLamda(){
        return i->String.valueOf(i*2);
    }
}
