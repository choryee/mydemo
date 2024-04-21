package ex08_Java_ParkEunJong;

public class Student {

    public static int serialNum=1000;
    private String name;
    private int grade;
    private int money;

    Student(String name, int grade, int money){
        this.name=name;
        this.grade=grade;
        this.money=money;
    }

    public void takeBus(int amount){
        money-=amount;
    }

    public void takeBus1(Bus bus, int pay){
        bus.take(pay);
        money-=pay;
    }

    public void takeSubway(int amount){
        money-=amount;
    }

    public void showInfo(){
        System.out.println(name+"님의 남은 돈은 "+money+"입니다.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", money=" + money +
                '}';
    }
}
