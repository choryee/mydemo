package ex10_Refactorying_Java_2nd.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    public String getType() {
        return "engineer";
    }
}
