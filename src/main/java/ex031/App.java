package ex031;

public class App {
    public static void main(String[] args) {
        Dog dg1 = new Dog("Puppy");
        Dog dg = new Dog();

        dg.setName("Snopie");
        System.out.println(dg.getName());
        System.out.println("----------------------");

        String d1 = dg.cry();
        System.out.println(d1);

        System.out.println("----------------------");
        BearAdaptor ba = new BearAdaptor(new OuterBear());
        String s1 = ba.getName();
        System.out.println(s1);
    }
}
