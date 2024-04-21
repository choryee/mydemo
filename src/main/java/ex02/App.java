package ex02;

public class App {
    public static void main(String[] args) {
        Mouse mo = new Mouse();
        Cat ct = new Cat();
        // DoorMan dm = new DoorMan();
        DoorManProxy dp = new DoorManProxy();

        // 밑은 extends 사용 안 할 때.
        DoorManProxy11 dp11 = new DoorManProxy11(new DoorMan());

        dp11.쫓아내(ct);
        System.out.println("------------------------");

        dp.쫓아내(mo);
        dp.쫓아내(ct);
        // System.out.println(mo.getName());

    }
}
