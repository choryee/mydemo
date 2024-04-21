package ex13_ChatGPT.DesignPatten.bridge;

// DrawAPI 인터페이스 (구현 계층의 역할)
interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}

// 구체적인 DrawAPI 구현 클래스들
class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

// 추상화된 모양을 나타내는 클래스 (추상화 계층의 역할)
abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

// 구체적인 모양 클래스들
class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

public class BridgePatternExample {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 100, 100, new RedCircle());
        Shape greenCircle = new Circle(20, 200, 200, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
