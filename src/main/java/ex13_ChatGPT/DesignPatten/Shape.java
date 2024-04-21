package ex13_ChatGPT.DesignPatten;


interface shapeInterface{
    void area();
}

class Rectangle implements shapeInterface{
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

        @Override
    public void area() {
        System.out.println("area is "+width*height);
    }
}

class Circle implements shapeInterface{
    double radius;
    private static final double PI=Math.PI;

//여기 Circle생성자 안 만들면, 밑에 처럼 번거롭게 값을 넣어줘야.
    @Override
    public void area() {
        System.out.println("area is "+ Math.ceil(radius*radius*PI) );
    }
}
public class Shape {
    public static void main(String[] args) {
        shapeInterface shape1=new Rectangle(10,20);
        shape1.area();

        Circle circle=new Circle();
        circle.radius=2.0;

        shapeInterface circle1=circle;
        circle1.area();
    }
}
