package ex10_Refactorying_Java_2nd.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    public String getType() {
        return "manager";
    }
}
