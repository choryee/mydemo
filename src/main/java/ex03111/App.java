package ex03111;

public class App {
    public static void main(String[] args) {
        Dog dg = new Dog("puppy");
        Cat ct = new Cat("kitty");

        DoorMan dm = new DoorMan();
        DoorManProxy dmp = new DoorManProxy(dm);

        dmp.remove("dock");

        // System.out.println(dg.getName() + " " + dm.KickOut());

    }
}
