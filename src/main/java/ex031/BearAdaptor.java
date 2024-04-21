package ex031;

public class BearAdaptor extends Animal {

    private OuterBear outerBear;

    public BearAdaptor(OuterBear outerBear) {
        this.outerBear = outerBear;
    }

    public String getName() {
        return outerBear.getFullName();
    }

}
