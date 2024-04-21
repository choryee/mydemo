package ex13_ChatGPT.DesignPatten.observer;

import java.util.ArrayList;
import java.util.List;

// Subject 인터페이스 (옵저버를 등록하고, 알림 기능을 제공)
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer{
    void update(int temperature);
}

class TemperatureSensor implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature=temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature);
        }
    }
}

class TemperatureDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated : "+temperature);
    }
}

public class ObserverEx {
    public static void main(String[] args) {
        TemperatureSensor ts=new TemperatureSensor();

        TemperatureDisplay td1=new TemperatureDisplay();
        TemperatureDisplay td2=new TemperatureDisplay();

        ts.registerObserver(td1);
        ts.registerObserver(td2);

        ts.setTemperature(100);

    }
}
