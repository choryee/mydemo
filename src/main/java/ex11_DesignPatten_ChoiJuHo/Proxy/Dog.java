package ex11_DesignPatten_ChoiJuHo.Proxy;

public class Dog extends Animal {
    private String name;

    Dog(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
