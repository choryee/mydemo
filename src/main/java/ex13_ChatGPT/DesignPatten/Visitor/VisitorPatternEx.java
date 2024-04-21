package ex13_ChatGPT.DesignPatten.Visitor;

// Visitor 인터페이스
interface Visitor { // 인터페이스는 객체의 구조만 나타내는 부분으로 역할을 함.
    void visit(Dog dog);
    void visit(Cat cat);
}

// Element 인터페이스
interface Animal { // 객체의 구조만 나타내는 부분.
    void accept(Visitor visitor);
}


class SoundVisitor implements Visitor{ //SoundVisitor에는 '기능'만을 나타내는 부분.

    @Override
    public void visit(Dog dog) {
        dog.bark();
    }

    @Override
    public void visit(Cat cat) {
        cat.meow();
    }
}


class Dog implements Animal{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void bark(){
        System.out.println("dog barks");
    }
}

class Cat implements Animal{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void meow(){
        System.out.println("cat meows");
    }
}
public class VisitorPatternEx {
    public static void main(String[] args) {
        Animal[] animals={new Dog(), new Cat()};
        Visitor soundVisitor=new SoundVisitor();
        for(Animal animal : animals){
            animal.accept(soundVisitor);
        }
    }
}
