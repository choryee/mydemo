package ex11_DesignPatten_ChoiJuHo.adaptor;

public class TestAdaptor {
    public static void main(String[] args) {
        Cat c=new Cat("Kitty");
        Dog d=new Dog("Biggle");
        TigerAdaptor ta=new TigerAdaptor(new OuterTiger());

        DoorMan dm=new DoorMan();
        dm.getOut(ta);




    }

}
