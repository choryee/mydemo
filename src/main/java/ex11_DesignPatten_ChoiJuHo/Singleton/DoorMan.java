package ex11_DesignPatten_ChoiJuHo.Singleton;

public class DoorMan {
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance(){
        return doorMan;
    }
    private DoorMan(){ //이렇게 생성자를 private으로 하면, 외부의 클래스에서 new를 못한다.

    }

    public void getOut(Animal animal){
        System.out.println(animal.getName()+" 를 좇아내!!");
    }
}
