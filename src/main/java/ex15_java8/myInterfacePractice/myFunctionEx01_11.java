package ex15_java8.myInterfacePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class myFunctionEx01_11<T> {
    public static void main(String[] args) { //240102
        //상품의 가격을 2배로 인상하기
        Product apple = new Product("apple", 25);
        Product banana = new Product("banana", 30);
        Product orange = new Product("orange", 35);

        List<Product> fruits = Arrays.asList(apple, banana, orange);
        fruits.stream()
                .map(i->i.getPrice()*2)
                .forEach(System.out::println);

        Product p = fruits.stream()
                .map(doublePrice1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("not found.."));

        System.out.println(p.toString());

        // 객체 생성
        String text = "Hello, World!";
        Integer number = 42;

        // getClass() 메서드를 사용하여, 객체의 클래스 정보, 얻기
        Class<?> textClass = text.getClass();
        Class<?> numberClass = number.getClass();

        // 얻은 클래스 정보 출력
        System.out.println("Text class: " + textClass.getName()); // java.lang.String
        System.out.println("Number class: " + numberClass.getName()); //java.lang.Integer

        System.out.println("----------");
//        for(Product product : fruits){
//            if(isMatched.test(product)){
//                System.out.println(product);
//            }
//        }

    }//main
    //private static  Function<Product,Product> doublePrice = product -> new Product(product.getName(), product.getPrice()*2);
    private static Function<Product, Product> doublePrice1 = new Function<Product, Product>() {
        @Override
        public Product apply(Product product) {
            return new Product(product.getName(), product.getPrice()*2);
        }
    };

//    private static Predicate<T> isMatched = new Predicate<T>() {// Predicate 이것은 다른 인터페이스함수를 사용해야
//        @Override
//        public boolean test(T t) {
//            return true;
//        }
//    };
}
