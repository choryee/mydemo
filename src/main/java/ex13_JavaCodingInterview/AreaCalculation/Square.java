package ex13_JavaCodingInterview.AreaCalculation;

public class Square implements shape{
    private final int width;

    Square(int width){
        this.width=width;
    }

    @Override
    public double area() {
        return width*width;
    }
}
