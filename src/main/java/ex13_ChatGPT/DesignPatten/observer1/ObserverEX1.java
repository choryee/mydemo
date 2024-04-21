package ex13_ChatGPT.DesignPatten.observer1;


import java.util.ArrayList;
import java.util.List;

interface Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

interface Observer{
    void updated(int temp);
}

class TempSensor implements Subject{
    private String name;
    private int temp;
    private List<Observer> observers=new ArrayList<>();

    TempSensor(String name){
        this.name=name;
    }

    public void setTemp(int temp){
        this.temp=temp;
       // this.temp=temp;
        notifyObserver(); //온도를 설정하자마자, notifyObserver호출함.
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer  );
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
           // o.updated(int temp);
            o.updated(temp);
        }
    }
}

class TempDisplay implements Observer{ // 관찰하는 개별 observer
    private String name;
    private int temp;

    TempDisplay(String name, int temp){
        this.name=name;
        this.temp=temp;
    }

    @Override
    public void updated(int temp) {
        System.out.println(name + " is updated to "+ temp);
    }
}

public class ObserverEX1 {
    public static void main(String[] args) {
        Observer ob1=new TempDisplay("aa", 12);
        Observer ob2=new TempDisplay("bb", 20);
        TempSensor ts=new TempSensor("Sensor1");
        ts.addObserver(ob1);
        ts.addObserver(ob2);
        ts.setTemp(300);
    }

}
