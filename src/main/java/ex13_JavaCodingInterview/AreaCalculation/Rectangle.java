package ex13_JavaCodingInterview.AreaCalculation;

public class Rectangle implements  shape{
    private final int width;
    private final int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width*height;
    }
}
