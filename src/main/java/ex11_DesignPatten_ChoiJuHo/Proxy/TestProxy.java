package ex11_DesignPatten_ChoiJuHo.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Cat c=new Cat("Kitty");
        Dog d=new Dog("Biggle");
        DoorMan dmp=new DoorManProxy();
        dmp.getOut(d);
        dmp.getOut(c);


    }

}
