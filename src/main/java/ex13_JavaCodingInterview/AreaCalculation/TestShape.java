package ex13_JavaCodingInterview.AreaCalculation;

import java.util.ArrayList;
import java.util.List;

public class TestShape {
    public static void main(String[] args) {
        shape shape1=new Circle(2); //12
        shape shape2=new Rectangle(3,3); //9
        shape shape3=new Square(2); // 4
        // total 25
        List<shape> list=new ArrayList<>();
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);

//밑, 기본 생성자와 인수있는 생성자 모두 위 처럼, shape shape1,2,3은 각각 생성해줘야.

//이렇게 기본 생성자로 add하려면, add매소드를 내가 따로 구현해야, 객체를 넣을 수 있다.
// 객체를 미리 새로 생성한 빈 List에 먼저 넣은 후 , 추가할 때는 밑밑에 인수있는 생성자 사용해야.
        AreaCalculator areaCalculator=new AreaCalculator();

//밑. 위 12라인에 list에 먼저 넣고, 그 리스트 통째로 넣을 때는, 매개변수 있는 생성자를 사용함.
        //인스턴스화 시에 사용자가 shapes 리스트를 직접 전달해야 합니다.
        //따라서, 사용자가 shapes 리스트를 미리 생성하고 있다면 AreaCalculator(List<shape> shapes) 생성자를 사용하여 인스턴스를 생성하고
        AreaCalculator areaCalc=new AreaCalculator(list);
        areaCalc.add(new Triangle(2,2));//2 AreaCalculator안에 add()매소드로
        //새로운 객체 추가한 것. 그래도, 총합 27이 나옴.

        System.out.println("areaCalc.sum()>>"+areaCalc.sum());
    }
}
