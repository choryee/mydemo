package ex08_Java_ParkEunJong;

public class TestTrans {
    public static void main(String[] args) {
        Student student=new Student("Kim", 1, 10000);
        student.takeBus(1000);
        System.out.println("money : "+student.getMoney());
        System.out.println("------------");

        Bus bus=new Bus(252, 10, 0);
        bus.earnMoney(1500, 20);
        System.out.println("Bus earning : "+bus.getMoney());//
        System.out.println("------------");

        Student student1=new Student("lee", 2, 10000);
        Bus bus1 =new Bus(255, 0, 0);
        student1.takeBus1(bus1, 1500);
        student1.showInfo();
        bus1.showInfo();
        System.out.println("------------");

        student1.takeBus1(bus1, 1500);
        student1.showInfo();
        bus1.showInfo();
        System.out.println("------------");




    }
}
