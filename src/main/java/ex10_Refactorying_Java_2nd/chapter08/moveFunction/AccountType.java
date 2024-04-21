package ex10_Refactorying_Java_2nd.chapter08.moveFunction;

public class AccountType {
    protected boolean isPremium;

    public double overdraftCharge(int daysOverdrawn) {
        if (this.isPremium) {
            int bankCharge = 10;
            if (daysOverdrawn <= 7) {
                return bankCharge;
            }
            else {
                return bankCharge * (daysOverdrawn - 7) * 0.85;
            }
        }
        else {
            return daysOverdrawn * 1.75;
        }
    }
}
