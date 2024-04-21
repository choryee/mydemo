package ex03;

public class App {
    public static void main(String[] args) {
        Mouse mo = new Mouse();
        Cat ct = new Cat();
        DoorMan dm = new DoorMan();

        TigerAdapter ot = new TigerAdapter(new OuterTiger());

        dm.쫓아내(mo);
        dm.쫓아내(ct);
        // System.out.println(mo.getName());

    }
}
