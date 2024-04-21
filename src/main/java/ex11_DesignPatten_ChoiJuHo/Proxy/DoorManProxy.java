package ex11_DesignPatten_ChoiJuHo.Proxy;

public class DoorManProxy extends  DoorMan{
//프록시 패턴은 이런 아이디어를 코드로 구현한 것입니다. 원본 객체 대신에, 특별한 객체(프록시)를 두어, 클라이언트와의 상호작용을 관리하거나 보완하게 됩니다.
// 프록시 패턴을 사용하면, 객체의 동작을 제어하거나 추가 기능을 제공하는 등의 작업을 보다 효과적으로 수행할 수 있습니다.
    @Override
    public void getOut(Animal animal) {
        System.out.println("안녕..");
        super.getOut(animal);
    }


}
