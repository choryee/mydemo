package ex13_JavaCodingInterview.AreaCalculation;

public class Triangle implements shape{
    private int bottom;
    public int height;

    Triangle(int bottom, int height){
        this.bottom=bottom;
        this.height=height;
    }

    @Override
    public double area() {
        return 0.5*height*bottom;
    }
}
