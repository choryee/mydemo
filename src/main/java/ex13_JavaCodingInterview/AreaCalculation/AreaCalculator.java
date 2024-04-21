package ex13_JavaCodingInterview.AreaCalculation;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {// p. 134
    private final List<shape> shapes; //AreaCalculator는 각기 다른 모먕을 가지는데, 그것이 인터페이스 shape이다.

    AreaCalculator(List<shape> shapes){ //교재에는 이것을 사용.
        this.shapes=shapes;
    }

    AreaCalculator(){ //기본 생성자.
        this.shapes=new ArrayList<>();
    }

    public Boolean add(shape shape){
        shapes.add(shape);
        return true;
    }

    public double sum(){
        int sum=0;
        for(shape shape : shapes){
            sum+=shape.area();
        }
        return sum;
    }

}
