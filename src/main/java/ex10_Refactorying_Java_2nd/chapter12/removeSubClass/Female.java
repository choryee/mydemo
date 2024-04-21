package ex10_Refactorying_Java_2nd.chapter12.removeSubClass;

public class Female extends Person {

    public Female(String name) {
        super(name);
    }

    @Override
    public String getGenderCode() {
        return "F";
    }
}
