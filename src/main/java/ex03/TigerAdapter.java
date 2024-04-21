package ex03;

public class TigerAdapter extends Animal {

    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return outerTiger.getFullName();
    }

}
