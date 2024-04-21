package ex10_Refactorying_Java_2nd.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Salesperson extends Employee {
    public Salesperson(String name) {
        super(name);
    }

    public String getType() {
        return "salesperson";
    }
}
