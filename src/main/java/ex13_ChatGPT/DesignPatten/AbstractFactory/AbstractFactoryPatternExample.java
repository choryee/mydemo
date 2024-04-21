package ex13_ChatGPT.DesignPatten.AbstractFactory;

// 모양을 나타내는 인터페이스
interface Shape {
    void draw();
}

// 원을 나타내는 클래스
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// 사각형을 나타내는 클래스
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// 추상 팩토리 인터페이스
interface ShapeFactory {
    Shape createShape();
}

// 원을 생성하는 구체적인 팩토리
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

// 사각형을 생성하는 구체적인 팩토리
class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        // 원을 생성하는 팩토리를 사용하여 원 생성
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // 사각형을 생성하는 팩토리를 사용하여 사각형 생성
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}
