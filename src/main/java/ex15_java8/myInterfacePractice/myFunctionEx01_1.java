package ex15_java8.myInterfacePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product1{
    private String name;
    private int price;

    Product1(String name, int price){
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

public class myFunctionEx01_1 {
    public static void main(String[] args) {
        //상품의 가격을 2배로 인상하기 - imperative coding 231228

        Product1 apple=new Product1("apple", 25);
        Product1 banana=new Product1("banana", 30);
        Product1 orange=new Product1("orange", 35);
        List<Product1> fruits= Arrays.asList(apple,banana,orange);

        List<Product1> newArr=new ArrayList<>();

        for(Product1 product1 : fruits){
            newArr.add(new Product1(product1.getName(), product1.getPrice()*2));
        }
        for(int i=0; i<newArr.size(); i++){
            System.out.println(newArr.get(i));
        }


    }// main



}
