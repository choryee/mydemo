package ex15_java8.myInterfacePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Product{
    private String name;
    private int price;

    Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Price: "+price;
    }
}

public class myFunctionEx01 {
    public static void main(String[] args) {
        //상품의 가격을 2배로 인상하기
        Product apple=new Product("apple", 25);
        Product banana=new Product("banana", 30);
        Product orange=new Product("orange", 35);
        List<Product> fruits= Arrays.asList(apple,banana,orange);

        Function<Product, Product> doudbledPrice = product -> new Product(product.getName(), product.getPrice()*2);

        List<Product> newFruits = new ArrayList<>();
        for(Product product : fruits){
            newFruits.add(doudbledPrice.apply(product)); // doudbledPrice.apply()를 적용하는 것.
        }

        for(Product product : newFruits){
            //System.out.println(product.getPrice());
        }
        newFruits.forEach(System.out::println);
        System.out.println("--------------------");

        Predicate<Product> isApple= i->i.getName().equals("apple");
        Product p = fruits.stream().filter(isApple).findFirst().orElse(null);
        System.out.println(
                p.toString()
        );
        fruits.stream().filter(isApple).forEach(System.out::println);


        //람다식
        doublePricing(fruits, i -> i.getPrice()*2 );

        // 매소드 레퍼런스로
        List<Integer> result
                = doublePricing(fruits, myFunctionEx01::doublingInt);
        for(int i=0; i<result.size(); i++){
            System.out.println("result.get(i)>>" + result.get(i));
        }

        //predicate 사용.
        moreThan30(fruits, product->product.getPrice()>30);


    }// main

    //1. 내가 사용할 Function<T,R>를 정의하는 매소드작성
    //2. 위 함수를 적용하는(위 함수의 apply()매소드 쓸 수 있는 것) 다른 매소드 작성.
    public static Function<Product, Integer> doublePriceFromObject(){
//        for(int i=0; i<list.size(); i++){
//            Product product = list.get(i);
//            int price = list.get(i).getPrice();
//        }
        // Function<Product, Integer>에 의해, 자동으로 밑은 타입이 추론됨. p는 Product으로 인지됨.
            return p -> p.getPrice()*2;
    }

    //2. 위 함수를 적용하는(위 함수의 apply매소드 쓸 수 있는 것) 다른 매소드 작성.
    public static List<Integer> doublePricing(List<Product> list, Function<Product, Integer> f ){
        List<Integer> list1 = new ArrayList<>();
        for(Product product : list){
            list1.add(f.apply(product));
            //list1.add(product->product.getPrice()*2); 이거 안 됨.
        }
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        return list1;
    }

    public static int doublingInt(Product product){
        return product.getPrice()*2;
    }
    public static List<Product> moreThan30(List<Product> list, Predicate<Product> predicate){
        List<Product> newArr = new ArrayList<>();
        for(Product product : list){
            if(predicate.test(product)){
                newArr.add(product);
            }
        }
        for(int i=0; i<newArr.size(); i++){
            System.out.println(newArr.get(i));
        }
        return newArr;
    }


}
