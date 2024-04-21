package ex02;

public class DoorManProxy11 {// 3강.

    // 밑은 2개는 Doorman을 extends안 하고 새로운 매소드를 추가하는 방법. 생성자 사용 하는 방법.(컴포지션방식,
    // composition)
    private DoorMan doorMan;

    public DoorManProxy11(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫓아내(Animal a) {
        doorMan.쫓아내(a);

        // System.out.println("안녕ㅎㅎ"); //이렇게 수정해버리면, OCP원칙 못 지킨 것. 기존 코드 수정하면 안됨.
        // System.out.println(a.getName() + " 쫓아내");
    }
}
