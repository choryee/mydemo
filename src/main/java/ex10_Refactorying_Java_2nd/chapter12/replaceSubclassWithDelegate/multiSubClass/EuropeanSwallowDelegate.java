package ex10_Refactorying_Java_2nd.chapter12.replaceSubclassWithDelegate.multiSubClass;

public class EuropeanSwallowDelegate extends SpeciesDelegate {
    public EuropeanSwallowDelegate(Data data) {
        super(data);
    }
    
    @Override
    public int airSpeedVelocity() {
        return 35;
    }
}
