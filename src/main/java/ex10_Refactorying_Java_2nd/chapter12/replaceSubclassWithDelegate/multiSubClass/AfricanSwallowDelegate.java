package ex10_Refactorying_Java_2nd.chapter12.replaceSubclassWithDelegate.multiSubClass;

public class AfricanSwallowDelegate extends SpeciesDelegate {
    int numberOfCounts;

    public AfricanSwallowDelegate(Data data) {
        super(data);
        this.numberOfCounts = data.numberOfCounts;
    }

    @Override
    public int airSpeedVelocity() {
        return 40 - 2 * numberOfCounts;
    }
}
