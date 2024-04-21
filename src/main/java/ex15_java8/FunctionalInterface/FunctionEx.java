package ex15_java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {

        System.out.println( function01(2, i -> String.valueOf(i*2) )); //람다식 이용
        System.out.println( function01(3, FunctionEx::doubleThenToString)); //method reference이용.


    }// main
    private static String function01(int a, Function<Integer, String> f){
        return "The result is "+ f.apply(a);
    }

    private static String doubleThenToString(int i){
        return String.valueOf(i*2);
    }
}
