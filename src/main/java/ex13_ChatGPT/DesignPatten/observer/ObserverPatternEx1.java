//package ex13_ChatGPT.DesignPatten.observer;
//
////temperature 다시.
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Subject1{
//    void registerObserver(Observer2 observer2);
//    void removeObserver(Observer2 observer2);
//    void notifyObserver();
//}
//
//class TempSensor implements Subject1{
//    private List<Observer2> observers=new ArrayList<>();
//    private int temp;
//
//    TempSensor(int temp){
//        this.temp=temp;
//    }
//
//    @Override
//    public void registerObserver(Observer2 observer2) {
//        observers.add(observer2);
//    }
//
//    @Override
//    public void removeObserver(Observer2 observer2) {
//        observers.remove(observer2);
//    }
//
//    @Override
//    public void notifyObserver() {
//        for(Observer2 o : observers){
//            o.updated(temp);
//        }
//    }
//}
//
//interface Observer2{
//    void updated(int temp);
//}
//
//class TempDisplay implements Observer2{
//    private String name;
//    private int temp;
//
//    TempDisplay(String name, int temp){
//        this.name=name;
//        this.temp=temp;
//    }
//
//    @Override
//    public void updated(int temp) {
//        System.out.println(name+ " updated temp is "+ temp);
//    }
//}
//
//public class ObserverPatternEx1 {
//    public static void main(String[] args) {
//        Observer2 o2=new TempDisplay("aa", 10);
//        Observer2 o3=new TempDisplay("bb", 20);
//
//        Subject1 s1=new TempSensor(100);
//        s1.registerObserver(o2);
//        s1.registerObserver(o3);
//
//        s1.notifyObserver();
//
//    }
//}
