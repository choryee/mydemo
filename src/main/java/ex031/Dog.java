package ex031;

public class Dog extends Animal {

    private String name;

    Dog() {
    }

    Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
