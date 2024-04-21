package ex03;

public class OuterTiger { // 외부에서 들고온 코드라고 생각해 보라.
    // 이 OuterTiger코드 원본을 고치면 안된다. OCT원칙에 위반됨.

    private String fullName = "TIGER";

    public String getFullName() {
        return fullName;

    }

}
