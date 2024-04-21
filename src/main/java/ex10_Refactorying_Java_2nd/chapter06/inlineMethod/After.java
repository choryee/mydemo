package ex10_Refactorying_Java_2nd.chapter06.inlineMethod;

public class After {

    public int rating(Driver driver) {
        return driver.numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
