package ex13_ChatGPT.DesignPatten.visitor1;

import java.util.ArrayList;
import java.util.List;

// Visitor (방문자) 인터페이스
interface AnimalVisitor {
    void feed(Dog dog);
    void feed(Cat cat);
}

// ConcreteVisitor (구체적인 방문자)
class Zookeeper implements AnimalVisitor {
    @Override
    public void feed(Dog dog) {
        System.out.println("Feeding dog");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("Feeding cat");
    }
}

// Element (요소) 인터페이스
interface Animal {
    void accept(AnimalVisitor visitor);
}

// ConcreteElement (구체적인 요소)
class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.feed(this);
    }
}

class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.feed(this);
    }
}

// ObjectStructure (객체 구조)
class AnimalZoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAnimals(AnimalVisitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}

class Book {
    public int a=2;
    static public int b=3;
}


public class VisitorPatternExample {
    public static void main(String[] args) {
        Book science = new Book();
        Book english = new Book();
//클래스 변수 b는 static으로 선언되어 클래스 레벨에서 관리됩니다. 따라서 science.b와 english.b는 동일한 메모리 위치를 참조하게 됩니다.
        english.a++;
        System.out.println(science.a); // 2->3
        english.b++;
        System.out.println(science.b); //
        science.a++;
        System.out.println(english.a);
        science.b++;
        System.out.println(english.b);

    // -----------------------------------
        AnimalZoo zoo = new AnimalZoo();
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Cat());

        AnimalVisitor zookeeper = new Zookeeper();
        zoo.feedAnimals(zookeeper);
    }
}
