package ex11_DesignPatten_ChoiJuHo.Strategy;

public class Cat extends Animal{
    private String name;

    Cat(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
