package ex11_DesignPatten_ChoiJuHo.Strategy;

public class TestAnimal {
    public static void main(String[] args) {
        DoorMan dm=new DoorMan();
        Cat c=new Cat("kitty");
        Dog d=new Dog("Bigel");
        dm.getOut(d);

    }
}
