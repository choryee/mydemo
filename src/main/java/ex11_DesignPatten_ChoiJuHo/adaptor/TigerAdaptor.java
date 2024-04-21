package ex11_DesignPatten_ChoiJuHo.adaptor;

public class TigerAdaptor extends Animal{

    //public  OuterTiger outerTiger=new OuterTiger();

    // 밑이 컴포지션패턴임.
    private OuterTiger outerTiger;
    TigerAdaptor(OuterTiger outerTiger){
        this.outerTiger=outerTiger;
    }

    @Override
    public String getName() {
        return this.outerTiger.getFullName();
    }
}
