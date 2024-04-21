package ex13_ChatGPT.DesignPatten.observer;

import java.util.ArrayList;
import java.util.List;

// Observer1 인터페이스
interface Subject1 {
    void registerObserver(Observer1 observer);
    void removeObserver(Observer1 observer);
    void notifyObserver(Observer1 observer1);
}

interface Observer1{
    void ship();
    void arrive();
    void delay();
}

// ConcreteObserver1 클래스
class LogisticsCenter implements Observer1 {
    private String name;
    private List<Product> productList=new ArrayList<>();

    LogisticsCenter(String name){
        this.name=name;
    }

    @Override
    public void ship() {

    }

    @Override
    public void arrive() {

    }

    @Override
    public void delay() {

    }
}

class Product {
    private String name;

    Product(String name){
        this.name=name;
    }


}
public class LogisticsSystemEx {
    public static void main(String[] args) {

    }
}
