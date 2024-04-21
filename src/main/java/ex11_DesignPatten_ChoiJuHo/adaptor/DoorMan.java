package ex11_DesignPatten_ChoiJuHo.adaptor;

public class DoorMan {

    //아니요, 매개변수로 넣은 Animal animal은 자동으로 인스턴스화되지 않습니다. 메소드의 매개변수는 해당 메소드를 호출할 때 전달된 인자에 의해 값이 할당됩니다.
    // 따라서 getOut 메소드를 호출할 때 실제 Animal 객체를 인자로 전달해야 합니다.
    public void getOut(Animal animal){
        //위와 같이 Animal 클래스가 getName() 메소드를 가지고 있다면, animal.getName()은 해당 인스턴스의 이름을 반환합니다. 호출 코드는 다음과 같이 사용될 것입니다:
        System.out.println(animal.getName()+" 를 좇아내!!");

        //여기에 밑처럼, 추가해버리면, OCP규정을 못 지킨것. 기존 코드를 수정하면 안된다.3강.02;10
        // System.out.println("안녕..");
    }
}
