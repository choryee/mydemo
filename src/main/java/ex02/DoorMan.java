package ex02;

public class DoorMan { // ex02에서 도어맨의 기능("안녕ㅎㅎ",매소드)을 추가하고 싶을 때. 03강

    // DoorManProxy.java로 밑 매소드 보냄. ocp지키기 위해
    public void 쫓아내(Animal a) {

        // System.out.println("안녕ㅎㅎ"); //이렇게 수정해버리면, OCP원칙 못 지킨 것. 기존 코드 수정하면 안됨.
        System.out.println(a.getName() + " 쫓아내");
    }
}
