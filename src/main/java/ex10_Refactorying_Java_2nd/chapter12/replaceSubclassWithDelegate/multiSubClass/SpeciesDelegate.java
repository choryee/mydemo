package ex10_Refactorying_Java_2nd.chapter12.replaceSubclassWithDelegate.multiSubClass;

public class SpeciesDelegate {
    String plumage;

    public SpeciesDelegate(Data data) {
        this.plumage = data.plumage;
    }

    public String getPlumage() {
        return plumage;
    }

    public int airSpeedVelocity() {
        return 0;
    }
}
