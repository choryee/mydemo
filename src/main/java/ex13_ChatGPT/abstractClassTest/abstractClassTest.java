package ex13_ChatGPT.abstractClassTest;


abstract class Animal{
    abstract void eat();
    void sleep(Animal animal){
        System.out.println(animal+ " is sleeping!!");
    }
}

class Dog extends Animal{
    protected String name;

    Dog(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    void eat() {
        // System.out.println( this + "is eating..");// this 이렇게 하면, 객체 전체 그 자체.
        System.out.println( this.name + "is eating..");
    }

    @Override
    void sleep(Animal animal) {
        super.sleep(animal); // 상위 클래스의 메서드 호출
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class abstractClassTest {
    public static void main(String[] args) {
    Animal dog=new Dog("Bigel");
    dog.sleep(dog);
    dog.eat();

    }
}
