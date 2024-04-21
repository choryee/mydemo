package ex13_JavaCodingInterview.AreaCalculation;

public class Circle implements shape   {
    private final int radius;

    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
