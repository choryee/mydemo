package ex11_DesignPatten_ChoiJuHo.adaptor;

public class OuterTiger { //이 코드를 예전에 사용하던 레거시 코드라고 가정하자. 이것을 이젠 새 코드에 사용하고 싶다.
    //그런데, 여기 코드는 절대 수정하면 안됨. OCP에 어긋남.
    private String fullName="호랑이";

    public String getFullName(){
        return this.fullName;
    }
}
