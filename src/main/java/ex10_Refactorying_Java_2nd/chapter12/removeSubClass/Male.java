package ex10_Refactorying_Java_2nd.chapter12.removeSubClass;

public class Male extends Person {
    public Male(String name) {
        super(name);
    }

    @Override
    public String getGenderCode() {
        return "M";
    }
}
