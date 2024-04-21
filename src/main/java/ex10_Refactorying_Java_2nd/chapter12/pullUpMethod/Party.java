package ex10_Refactorying_Java_2nd.chapter12.pullUpMethod;

public class Party {
    int monthlyCost;

    public int annualCost() {
        return monthlyCost * 12;
    }
}
