package ex02;

public class DoorManProxy extends DoorMan {// 3강.

    public void 쫓아내(Animal a) {
        super.쫓아내(a);

        // System.out.println("안녕ㅎㅎ"); //이렇게 수정해버리면, OCP원칙 못 지킨 것. 기존 코드 수정하면 안됨.
        // System.out.println(a.getName() + " 쫓아내");
    }
}
