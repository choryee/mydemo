package ex10_Refactorying_Java_2nd.chapter12.replaceSubclassWithDelegate.multiSubClass;

public class EuropeanSwallow extends Bird {
    public EuropeanSwallow(Data data) {
        super(data);
    }

    @Override
    public int airSpeedVelocity() {
        return 35;
    }
}
